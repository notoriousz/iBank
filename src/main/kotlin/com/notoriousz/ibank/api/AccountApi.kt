package com.notoriousz.ibank.api

import com.notoriousz.ibank.controller.dto.request.CashDeposit
import com.notoriousz.ibank.controller.dto.request.CashWithdraw
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RequestMapping("/api/v1/accounts")
interface AccountApi {

    @PostMapping("/{accountId}/deposit")
    @ResponseStatus(HttpStatus.OK)
    fun deposit(
        @PathVariable accountId: Long,
        @RequestBody deposit: CashDeposit
    )

    @PostMapping("/{accountId}/withdraw")
    @ResponseStatus(HttpStatus.OK)
    fun withdraw(
        @PathVariable accountId: Long,
        @RequestBody withdraw: CashWithdraw
    )

}
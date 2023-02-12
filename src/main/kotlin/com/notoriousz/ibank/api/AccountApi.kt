package com.notoriousz.ibank.api

import com.notoriousz.ibank.controller.dto.request.CashDeposit
import com.notoriousz.ibank.controller.dto.request.CashWithdraw
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RequestMapping("/api/v1")
interface AccountApi {

    @PostMapping("/accounts/{id}/deposit")
    @ResponseStatus(HttpStatus.OK)
    fun deposit(
        @PathVariable id: Long,
        @RequestBody deposit: CashDeposit
    )

    @PostMapping("/accounts/{id}/withdraw")
    @ResponseStatus(HttpStatus.OK)
    fun withdraw(
        @PathVariable id: Long,
        @RequestBody withdraw: CashWithdraw
    )

}
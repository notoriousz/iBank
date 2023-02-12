package com.notoriousz.ibank.controller

import com.notoriousz.ibank.api.AccountApi
import com.notoriousz.ibank.controller.dto.request.CashDeposit
import com.notoriousz.ibank.controller.dto.request.CashWithdraw
import com.notoriousz.ibank.domain.service.AccountServiceImpl
import org.springframework.web.bind.annotation.RestController


@RestController
class AccountController(
    private val accountService: AccountServiceImpl
): AccountApi {

    override fun deposit(
        accountId: Long,
        deposit: CashDeposit
    ) = accountService.deposit(accountId, deposit)


    override fun withdraw(
        accountId: Long,
        withdraw: CashWithdraw
    ) = accountService.withdraw(accountId, withdraw)

}

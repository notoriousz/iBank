package com.notoriousz.ibank.domain

import com.notoriousz.ibank.controller.dto.request.CashDeposit
import com.notoriousz.ibank.controller.dto.request.CashWithdraw

interface AccountService {

    fun deposit(
        accountId: Long,
        deposit: CashDeposit
    )

    fun withdraw(
        accountId: Long,
        withdraw: CashWithdraw
    )

}
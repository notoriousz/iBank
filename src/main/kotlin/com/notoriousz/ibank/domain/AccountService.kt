package com.notoriousz.ibank.domain

import com.notoriousz.ibank.controller.dto.request.CashDeposit

interface AccountService {

    fun deposit(
        accountId: Long,
        deposit: CashDeposit
    )

    fun withdraw()

}
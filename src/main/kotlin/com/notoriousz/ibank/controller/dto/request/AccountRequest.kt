package com.notoriousz.ibank.controller.dto.request

import com.notoriousz.ibank.enums.AccountType
import java.math.BigDecimal

class AccountRequest(
    var id: Long?,
    var amount: BigDecimal,
    var type: AccountType,
)

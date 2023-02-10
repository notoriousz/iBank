package com.notoriousz.ibank.controller.dto.response

import com.notoriousz.ibank.enums.AccountType
import java.math.BigDecimal

class AccountResponse(

    var id: Long?,

    var amount: BigDecimal,

    var type: AccountType,

)

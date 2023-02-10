package com.notoriousz.ibank.controller.dto.response

data class CustomerResponse(

    var id: Long?,

    var name: String,

    var password: String,

    var accounts: AccountResponse? = null,

)

package com.notoriousz.ibank.controller.dto.response

import com.fasterxml.jackson.annotation.JsonAlias
import com.notoriousz.ibank.entities.Account
import java.time.LocalDateTime

data class CustomerResponse(

    var id: Long?,

    var name: String,

    var password: String,

    var accounts: Account? = null,

    @JsonAlias("created_at")
    var createdAt: LocalDateTime
)

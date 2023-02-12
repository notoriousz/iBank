package com.notoriousz.ibank.controller.dto.response

import com.notoriousz.ibank.entities.Account
import java.time.LocalDateTime

data class CustomerResponse(
    var id: Long?,
    var name: String,
    var password: String,
    var email: String,
    var account: Account? = null,
    var createdAt: LocalDateTime
)

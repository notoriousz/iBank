package com.notoriousz.ibank.entities

import com.notoriousz.ibank.enums.AccountType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*

@Entity(name = "account")
data class Account(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @jakarta.persistence.Column
    var amount: BigDecimal = BigDecimal.ZERO,

    @jakarta.persistence.Column
    @jakarta.persistence.Enumerated
    var type: AccountType,

    @jakarta.persistence.Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @jakarta.persistence.Column(name = "update_at")
    var updateAt: LocalDateTime = LocalDateTime.now()
)

package com.notoriousz.ibank.entities

import com.notoriousz.ibank.enums.AccountType
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "account")
data class Account(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?= null,

    @Column
    var amount: BigDecimal = BigDecimal.ZERO,

    @Column
    @Enumerated
    var type: AccountType = AccountType.CHECKING_ACCOUNT,

    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "update_at")
    var updateAt: LocalDateTime = LocalDateTime.now()
)

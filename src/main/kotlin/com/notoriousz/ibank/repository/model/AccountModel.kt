package com.notoriousz.ibank.repository.model

import com.notoriousz.ibank.enums.AccountType
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.*

@Entity(name = "account")
data class AccountModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: UUID?,

    @Column
    var amount: BigDecimal = BigDecimal.ZERO,

    @Column
    @Enumerated
    var type: AccountType,

    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "update_at")
    var updateAt: LocalDateTime = LocalDateTime.now()
)

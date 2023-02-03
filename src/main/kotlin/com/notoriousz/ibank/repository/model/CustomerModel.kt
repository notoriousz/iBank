package com.notoriousz.ibank.repository.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.*


@Entity(name = "customer")
data class CustomerModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: UUID,

    @Column
    var name: String,

    @Column
    var password: String,

    @ManyToOne
    @JoinColumn(name = "account_id")
    var accounts: AccountModel?,

    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "update_at")
    var updateAt: LocalDateTime = LocalDateTime.now()

)





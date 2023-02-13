package com.notoriousz.ibank.entities

import java.time.LocalDateTime
import javax.persistence.*


@Entity(name = "customer")
data class Customer(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column
    var name: String,

    @Column
    var email: String,

    @Column
    var password: String,

    @ManyToOne
    @JoinColumn(name = "account_id")
    var accounts: Account? = null,

    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "update_at")
    var updateAt: LocalDateTime = LocalDateTime.now()

)

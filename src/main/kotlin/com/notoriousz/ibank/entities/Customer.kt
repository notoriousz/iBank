package com.notoriousz.ibank.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime
import java.util.*


@Entity(name = "customer")
data class Customer(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @jakarta.persistence.Column
    var name: String,

    @jakarta.persistence.Column
    var email: String,

    @jakarta.persistence.Column
    var password: String,

    @ManyToOne
    @JoinColumn(name = "account_id")
    var accounts: Account?,

    @jakarta.persistence.Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @jakarta.persistence.Column(name = "update_at")
    var updateAt: LocalDateTime = LocalDateTime.now()

)

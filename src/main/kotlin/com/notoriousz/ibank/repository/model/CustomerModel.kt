package com.notoriousz.ibank.repository.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime
import java.util.*


@Entity
data class CustomerModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: UUID? = UUID.randomUUID(),

    @Column
    var name: String,

    @Column
    var password: String,

    @Column
    var createdAt: LocalDateTime = LocalDateTime.now()
)





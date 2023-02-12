package com.notoriousz.ibank.mapper

import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import com.notoriousz.ibank.entities.Account
import com.notoriousz.ibank.entities.Customer

fun CustomerRequest.toCustomerEntity(): Customer
= Customer(
    name = this.name,
    email = this.email,
    password = this.password,
)

fun Customer.toCustomerResponse(): CustomerResponse
= CustomerResponse(
    id = this.id,
    name = this.name,
    password = this.password,
    email = this.email,
    account = this.accounts,
    createdAt = this.createdAt
)

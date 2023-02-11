package com.notoriousz.ibank.domain

import com.notoriousz.ibank.entities.Customer


interface CustomerService {

    fun create(customer: Customer)

    fun findAllCustomers(): List<Customer>

}
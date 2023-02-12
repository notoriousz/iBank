package com.notoriousz.ibank.domain

import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.entities.Customer


interface CustomerService {

    fun create(customer: Customer)

    fun findAllCustomers(): List<Customer>

    fun findById(id: Long): Customer

    fun updateCustomer(id: Long, request: CustomerRequest)

    fun deleteCustomer(id: Long)

}
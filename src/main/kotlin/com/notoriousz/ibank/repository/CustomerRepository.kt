package com.notoriousz.ibank.repository

import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import com.notoriousz.ibank.entities.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CustomerRepository : JpaRepository<Customer, Long> {
    fun getCustomerById(id: Long): Customer

}

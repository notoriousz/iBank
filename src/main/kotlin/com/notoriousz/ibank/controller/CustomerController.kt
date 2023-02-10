package com.notoriousz.ibank.controller

import com.notoriousz.ibank.controller.api.CustomerApi
import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import com.notoriousz.ibank.domain.service.CustomerServiceImpl
import com.notoriousz.ibank.entities.Account
import com.notoriousz.ibank.entities.Customer
import com.notoriousz.ibank.enums.AccountType
import com.notoriousz.ibank.repository.CustomerRepository
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


class CustomerController(
    private val customerService: CustomerServiceImpl
) : CustomerApi {

    override fun createCustomers(newCustomer: CustomerRequest) {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<CustomerResponse> {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): CustomerResponse {
        TODO("Not yet implemented")
    }

    override fun updateCustomer(id: Long) {
        TODO("Not yet implemented")
    }

    override fun deleteCustomer(id: Long) {
        TODO("Not yet implemented")
    }

}

package com.notoriousz.ibank.controller

import com.notoriousz.ibank.api.CustomerApi
import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import com.notoriousz.ibank.domain.service.CustomerServiceImpl
import com.notoriousz.ibank.mapper.toCustomerEntity
import com.notoriousz.ibank.mapper.toCustomerResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController


@RestController
class CustomerController(
    private val customerService: CustomerServiceImpl
) : CustomerApi {

    override fun createCustomers(newCustomer: CustomerRequest){
        val customer =
            newCustomer.toCustomerEntity()

        customerService.create(customer)
    }

    override fun getAll(): ResponseEntity<List<CustomerResponse>> {

        val listOfCustomers =
            customerService.findAllCustomers()
                .map { it.toCustomerResponse() }

        return ResponseEntity.ok().body(listOfCustomers)
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

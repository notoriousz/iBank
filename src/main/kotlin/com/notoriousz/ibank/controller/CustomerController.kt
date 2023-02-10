package com.notoriousz.ibank.controller

import com.notoriousz.ibank.api.CustomerApi
import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController : CustomerApi {

    override fun createCustomers(newCustomer: CustomerRequest) {
        TODO("Not yet implemented")
    }

    override fun getAll(): ResponseEntity<CustomerResponse> {
        return ResponseEntity.ok().body(CustomerResponse(1, "math", "test"))
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

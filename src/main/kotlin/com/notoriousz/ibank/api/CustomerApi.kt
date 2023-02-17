package com.notoriousz.ibank.api

import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RequestMapping("/api/v1/customers")
interface CustomerApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createCustomers(@RequestBody newCustomer: CustomerRequest)

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<CustomerResponse>

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getById(
        @PathVariable id: Long
    ): CustomerResponse

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun updateCustomer(
        @PathVariable id: Long,
        @RequestBody request: CustomerRequest
    )

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteCustomer(
        @PathVariable id: Long
    )

}

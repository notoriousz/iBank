package com.notoriousz.ibank.api

import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/api/v1")
interface CustomerApi {

    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    fun createCustomers(@RequestBody newCustomer: CustomerRequest)

    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<CustomerResponse>

    @GetMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getById(
        @PathVariable id: Long
    ): CustomerResponse

    @PutMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun updateCustomer(
        @PathVariable id: Long,
        @RequestBody request: CustomerRequest
    )

    @DeleteMapping("/customers/{id}")
    fun deleteCustomer(
        @PathVariable id: Long
    )

}

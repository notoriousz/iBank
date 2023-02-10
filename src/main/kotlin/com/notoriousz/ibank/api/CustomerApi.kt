package com.notoriousz.ibank.api

import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1")
interface CustomerApi {

    @PostMapping("/customers")
    fun createCustomers(
        @RequestBody newCustomer: CustomerRequest
    )

    @GetMapping
    fun getAll(): ResponseEntity<CustomerResponse>

    @GetMapping("/customers/{id}")
    fun getById(
        @PathVariable id: Long
    ): CustomerResponse

    @PutMapping("/customers/{id}")
    fun updateCustomer(
        @PathVariable id: Long
    )

    @DeleteMapping("/customers/{id}")
    fun deleteCustomer(
        @PathVariable id: Long
    )

}

package com.notoriousz.ibank.api

import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import org.hibernate.annotations.Cache
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.persistence.Cacheable

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
    @ResponseStatus(HttpStatus.OK)
    fun deleteCustomer(
        @PathVariable id: Long
    )

}

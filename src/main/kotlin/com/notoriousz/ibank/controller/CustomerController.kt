package com.notoriousz.ibank.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class CustomerController {

    @GetMapping("/customers")
    fun getAllCustomers(): String = "Testing"

}
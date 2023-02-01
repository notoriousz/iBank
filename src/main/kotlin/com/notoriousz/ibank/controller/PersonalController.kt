package com.notoriousz.ibank.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PersonalController {

    @GetMapping("/hello")
    fun test(): String{
        return "Hello World"
    }
}
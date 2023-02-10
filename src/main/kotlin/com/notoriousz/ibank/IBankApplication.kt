package com.notoriousz.ibank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
//@EntityScan("com.notoriousz.ibank.entities")
class IBankApplication

fun main(args: Array<String>) {
    runApplication<IBankApplication>(*args)
}

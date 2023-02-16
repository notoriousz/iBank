package com.notoriousz.ibank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class IBankApplication

fun main(args: Array<String>) {
    runApplication<IBankApplication>(*args)
}

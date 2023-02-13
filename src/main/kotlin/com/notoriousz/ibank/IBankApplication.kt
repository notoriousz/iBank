package com.notoriousz.ibank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IBankApplication

fun main(args: Array<String>) {
    runApplication<IBankApplication>(*args)
}

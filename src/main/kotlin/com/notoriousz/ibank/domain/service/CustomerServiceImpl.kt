package com.notoriousz.ibank.domain.service

import com.notoriousz.ibank.domain.CustomerService
import com.notoriousz.ibank.repository.CustomerRepository
import mu.KotlinLogging

class CustomerServiceImpl(
    private val customerRepository: CustomerRepository
) : CustomerService {

    val logger = KotlinLogging.logger {}

}
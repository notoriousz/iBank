package com.notoriousz.ibank.domain.service

import com.notoriousz.ibank.domain.CustomerService
import com.notoriousz.ibank.entities.Customer
import com.notoriousz.ibank.repository.CustomerRepository
import mu.KotlinLogging
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl(
    private val customerRepository: CustomerRepository
) : CustomerService {

    val logger = KotlinLogging.logger {}

    override fun create(customer: Customer) {

        logger.info { "Creating New Customer" }

        customerRepository.save(customer)
    }

    override fun findAllCustomers(): List<Customer> {

        logger.info { "Find all customers" }

        return customerRepository.findAll()
    }

    override fun findById(id: Long): Customer =
        customerRepository.getCustomerById(id)



}
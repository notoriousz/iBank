package com.notoriousz.ibank.domain.service

import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.domain.CustomerService
import com.notoriousz.ibank.entities.Account
import com.notoriousz.ibank.entities.Customer
import com.notoriousz.ibank.repository.AccountReponsitory
import com.notoriousz.ibank.repository.CustomerRepository
import mu.KotlinLogging
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl(
    private val customerRepository: CustomerRepository,
    private val accountReponsitory: AccountReponsitory
) : CustomerService {

    val logger = KotlinLogging.logger {}

    override fun create(customer: Customer) {

        logger.info { "Creating New Customer" }

        val newAccount = Account()

        accountReponsitory.save(newAccount)

        customer.accounts = newAccount

        customerRepository.save(customer)
    }

    @Cacheable("customers")
    override fun findAllCustomers(): List<Customer> {

        logger.info { "Find all customers" }

        return customerRepository.findAll()
    }

    @Cacheable("customer")
    override fun findById(id: Long): Customer =
        customerRepository.getCustomerById(id)


    override fun updateCustomer(id: Long, request: CustomerRequest) {
        val customer = findById(id)

        customer.let {
            it.name = request.name
            it.email = request.email
            it.password = request.password
        }

        logger.info { "Update customer $customer" }

        customerRepository.save(customer)

    }

    override fun deleteCustomer(id: Long) {

        logger.info { "Delete customer $id" }

        customerRepository.deleteById(id)
    }

}

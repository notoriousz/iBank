package com.notoriousz.ibank.controller

import com.notoriousz.ibank.entities.Account
import com.notoriousz.ibank.entities.Customer
import com.notoriousz.ibank.enums.AccountType
import com.notoriousz.ibank.repository.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/api/v1")
class CustomerController(
    private val customerRepository: CustomerRepository
) {

    @GetMapping("/customers")
    fun getAllCustomers(): List<Customer> {

        val accountFake = Account(
            id = 1,
            type = AccountType.CHECKING_ACCOUNT
            )

//        val accounts = listOf<AccountModel>(accountFake)

        val customers = listOf<Customer>(
            Customer(id = 1, name ="Math", password = "123", accounts = accountFake),
            Customer(id = 2,name ="Caio", password =  "123", accounts = accountFake),
            Customer(id = 3,name ="Bois", password = "123", accounts = accountFake)
        )

//        return customerRepository.findAll().toList()
        return customers
    }

}
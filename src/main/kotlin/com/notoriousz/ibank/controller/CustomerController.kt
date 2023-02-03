package com.notoriousz.ibank.controller

import com.notoriousz.ibank.enums.AccountType
import com.notoriousz.ibank.repository.model.AccountModel
import com.notoriousz.ibank.repository.model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/api/v1")
class CustomerController() {

    @GetMapping("/customers")
    fun getAllCustomers(): List<CustomerModel> {

        val accountFake = AccountModel(
            id = UUID.randomUUID(),
            type = AccountType.CHECKING_ACCOUNT
            )

//        val accounts = listOf<AccountModel>(accountFake)

        val customers = listOf<CustomerModel>(
            CustomerModel(id = UUID.randomUUID(), name ="Math", password = "123", accounts = accountFake),
            CustomerModel(id = UUID.randomUUID(),name ="Caio", password =  "123", accounts = accountFake),
            CustomerModel(id = UUID.randomUUID(),name ="Bois", password = "123", accounts = accountFake)
        )

       // return customerRepository.findAll().toList()
        return customers
    }

}
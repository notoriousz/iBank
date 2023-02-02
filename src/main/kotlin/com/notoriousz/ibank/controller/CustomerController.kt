package com.notoriousz.ibank.controller

//import com.notoriousz.ibank.repository.CustomerRepository
import com.notoriousz.ibank.repository.model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class CustomerController(
//    private val customerRepository: CustomerRepository
) {
    @GetMapping("/customers")
    fun getAllCustomers(): List<CustomerModel> {

        val customers = listOf<CustomerModel>(
            CustomerModel("Math", "123"),
            CustomerModel("Math", "123"),
            CustomerModel("Math", "123")
        )

       // return customerRepository.findAll().toList()
        return customers
    }

}
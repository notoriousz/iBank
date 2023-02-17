package com.notoriousz.ibank.controller

import com.notoriousz.ibank.api.CustomerApi
import com.notoriousz.ibank.controller.dto.request.CashWithdraw
import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import com.notoriousz.ibank.domain.service.AccountServiceImpl
import com.notoriousz.ibank.domain.service.CustomerServiceImpl
import com.notoriousz.ibank.mapper.toCustomerEntity
import com.notoriousz.ibank.mapper.toCustomerResponse
import com.notoriousz.ibank.repository.CustomerRepository
import org.springframework.hateoas.Link
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal


@RestController
class CustomerController(
    private val customerService: CustomerServiceImpl,
    private val customerRepository: CustomerRepository
) : CustomerApi {


    override fun createCustomers(newCustomer: CustomerRequest){
        val customer =
            newCustomer.toCustomerEntity()

        customerService.create(customer)
    }

    override fun getAll(): List<CustomerResponse> = customerService
        .findAllCustomers()
            .map { it.toCustomerResponse() }


    override fun getById(id: Long): CustomerResponse {

        val accountId = customerService.findById(id).accounts?.id

        val selfLink = linkTo(CustomerController::class.java)
            .slash(id)
            .withSelfRel()

        val accountLink = linkTo(AccountController::class.java)
            .slash(accountId)
            .withRel("manage_account")

        return customerService
            .findById(id)
            .toCustomerResponse()
            .add(selfLink, accountLink)
    }


    override fun updateCustomer(id: Long, request: CustomerRequest) =
        customerService.updateCustomer(id, request)

    override fun deleteCustomer(id: Long) =
        customerService.deleteCustomer(id)

}

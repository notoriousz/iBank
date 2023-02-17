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
) : CustomerApi {


    override fun createCustomers(newCustomer: CustomerRequest){
        val customer =
            newCustomer.toCustomerEntity()

        customerService.create(customer)
    }

    override fun getAll(): List<CustomerResponse> = customerService
            .findAllCustomers()
            .map {
                val selfLink = linkTo(CustomerController::class.java).slash(it.id).withSelfRel()
                it.toCustomerResponse().add(selfLink)
            }


    override fun getById(id: Long): CustomerResponse {

        val accountId = customerService.findById(id).accounts?.id

        val selfLink = linkTo(CustomerController::class.java)
            .slash(id)
            .withSelfRel()

        val accountLinkWithdraw = linkTo(AccountController::class.java)
            .slash(accountId)
            .slash("withdraw")
            .withRel("manage_account")

        val accountLinkDeposit = linkTo(AccountController::class.java)
            .slash(accountId)
            .slash("deposit")
            .withRel("manage_account")

        return customerService
            .findById(id)
            .toCustomerResponse()
            .add(selfLink, accountLinkWithdraw, accountLinkDeposit)
    }


    override fun updateCustomer(id: Long, request: CustomerRequest) =
        customerService.updateCustomer(id, request)

    override fun deleteCustomer(id: Long) =
        customerService.deleteCustomer(id)

}

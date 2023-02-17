package com.notoriousz.ibank.controller

import com.notoriousz.ibank.api.CustomerApi
import com.notoriousz.ibank.controller.dto.request.CustomerRequest
import com.notoriousz.ibank.controller.dto.response.CustomerResponse
import com.notoriousz.ibank.domain.service.CustomerServiceImpl
import com.notoriousz.ibank.mapper.toCustomerEntity
import com.notoriousz.ibank.mapper.toCustomerResponse
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo
import org.springframework.web.bind.annotation.RestController


@RestController
class CustomerController(
    private val customerService: CustomerServiceImpl
) : CustomerApi {


    override fun createCustomers(newCustomer: CustomerRequest){
        val customer =
            newCustomer.toCustomerEntity()

        customerService.create(customer)
    }

    override fun getAll(): List<CustomerResponse> =
        customerService.findAllCustomers()
            .map { it.toCustomerResponse() }


    override fun getById(id: Long): CustomerResponse {

        val selfLink = linkTo(AccountController::class.java).withSelfRel()

        return customerService
            .findById(id)
            .toCustomerResponse()
            .add(selfLink)
    }


    override fun updateCustomer(id: Long, request: CustomerRequest) =
        customerService.updateCustomer(id, request)

    override fun deleteCustomer(id: Long) =
        customerService.deleteCustomer(id)

}

package com.notoriousz.ibank.domain.service

import com.notoriousz.ibank.domain.AccountService
import com.notoriousz.ibank.repository.AccountReponsitory
import com.notoriousz.ibank.repository.CustomerRepository
import org.springframework.stereotype.Service


@Service
class AccountServiceImpl(
    private val accountRepository: AccountReponsitory,
    private val customerRepository: CustomerRepository
): AccountService {

    override fun deposit() {
        TODO("Not yet implemented")
    }

    override fun withdraw() {
        TODO("Not yet implemented")
    }

}

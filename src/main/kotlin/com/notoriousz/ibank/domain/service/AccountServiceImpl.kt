package com.notoriousz.ibank.domain.service

import com.notoriousz.ibank.controller.dto.request.CashDeposit
import com.notoriousz.ibank.domain.AccountService
import com.notoriousz.ibank.repository.AccountReponsitory
import com.notoriousz.ibank.repository.CustomerRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime


@Service
class AccountServiceImpl(
    private val accountRepository: AccountReponsitory
): AccountService {

    override fun deposit(accountId: Long, deposit: CashDeposit) {

        val account =
            accountRepository.findById(accountId)
                .get()

        val valueToSum = deposit.amount

        account.amount += valueToSum
        account.updateAt = LocalDateTime.now()

        accountRepository.save(account)
    }

    override fun withdraw() {
        TODO("Not yet implemented")
    }

}

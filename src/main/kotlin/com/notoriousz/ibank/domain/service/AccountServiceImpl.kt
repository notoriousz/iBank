package com.notoriousz.ibank.domain.service

import com.notoriousz.ibank.controller.dto.request.CashDeposit
import com.notoriousz.ibank.controller.dto.request.CashWithdraw
import com.notoriousz.ibank.domain.AccountService
import com.notoriousz.ibank.repository.AccountReponsitory
import mu.KotlinLogging
import org.springframework.stereotype.Service
import java.lang.RuntimeException
import java.math.BigDecimal
import java.time.LocalDateTime


@Service
class AccountServiceImpl(
    private val accountRepository: AccountReponsitory
): AccountService {

    val logger = KotlinLogging.logger {}

    override fun deposit(accountId: Long, deposit: CashDeposit) {

        val account = accountRepository
            .findById(accountId)
            .get()

        val valueToSum = deposit.amount

        account.amount += valueToSum
        account.updateAt = LocalDateTime.now()

        accountRepository.save(account)

        logger.info { "The deposit was successful" }
    }

    override fun withdraw(accountId: Long, withdraw: CashWithdraw) {

        val account = accountRepository
            .findById(accountId)
            .get()

        val valueToRemove = withdraw.amount

        account.amount -= valueToRemove
        account.updateAt = LocalDateTime.now()

        if(account.amount < BigDecimal.ZERO) throw Exception("Invalid Operation, amount is insufficient to remove $valueToRemove")

        accountRepository.save(account)

        logger.info { "The withdraw was successful" }
    }

}

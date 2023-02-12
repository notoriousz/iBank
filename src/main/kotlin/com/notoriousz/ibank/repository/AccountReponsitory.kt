package com.notoriousz.ibank.repository

import com.notoriousz.ibank.entities.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountReponsitory : JpaRepository<Account, Long> {

}

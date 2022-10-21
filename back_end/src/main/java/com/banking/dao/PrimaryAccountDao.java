package com.banking.dao;

import org.springframework.data.repository.CrudRepository;

import com.banking.model.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);

}

package com.banking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.model.PersonalTransaction;

public interface PersonalTransactionDao extends JpaRepository<PersonalTransaction, Integer>{

}

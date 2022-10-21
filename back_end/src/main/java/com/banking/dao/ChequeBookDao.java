package com.banking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.model.ChequeBook;

public interface ChequeBookDao extends JpaRepository<ChequeBook,Long> {
	

}

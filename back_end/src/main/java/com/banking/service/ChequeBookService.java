package com.banking.service;

import java.util.List;

import com.banking.model.ChequeBook;
import com.banking.model.User;

public interface ChequeBookService {
	public ChequeBook createChequeBook(ChequeBook chequebook,User user);
	public List<ChequeBook> AllChequeBooks();
	public ChequeBook findChequebookById(long id);
	public void ChequeBookRequestTrue(long id);
	public void ChequeBookRequestFalse(long id);
	

}

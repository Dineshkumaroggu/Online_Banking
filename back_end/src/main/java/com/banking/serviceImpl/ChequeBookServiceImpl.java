package com.banking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.dao.ChequeBookDao;
import com.banking.model.ChequeBook;
import com.banking.model.User;
import com.banking.service.ChequeBookService;
@Service
public class ChequeBookServiceImpl implements ChequeBookService{
	@Autowired
	ChequeBookDao checkbookdao;

	@Override
	public ChequeBook createChequeBook(ChequeBook chequebook,User user) {
		chequebook.setUser(user);
		return checkbookdao.save(chequebook);
		
	}

	@Override
	public List<ChequeBook> AllChequeBooks() {
		return checkbookdao.findAll();
	}

	@Override
	public ChequeBook findChequebookById(long id) {
		return checkbookdao.getOne(id);
	}

	@Override
	public void ChequeBookRequestTrue(long id) {
		ChequeBook chequeBook=checkbookdao.getOne(id);
		chequeBook.setAccepted(true);
		checkbookdao.save(chequeBook);
	}
	
	@Override
	public void ChequeBookRequestFalse(long id) {
		ChequeBook chequeBook=checkbookdao.getOne(id);
		chequeBook.setAccepted(false);
		checkbookdao.save(chequeBook);
		
	}

}

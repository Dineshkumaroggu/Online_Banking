package com.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banking.exceptions.ResourceNotFoundException;
import com.banking.model.Transaction;
import com.banking.model.User;
import com.banking.service.AdminService;
import com.banking.service.TransactionService;
import com.banking.serviceImpl.RegisterService;





@RestController
@RequestMapping(path = "/admin",method = RequestMethod.GET)
@CrossOrigin(origins = "http://localhost:4201")
public class AdminController {
	
@Autowired
RegisterService regservice;

@Autowired
TransactionService transactionService;
	

@Autowired
AdminService adminservice;
	@RequestMapping(path = "/getallusers", method = RequestMethod.GET)
	public List<User> getAllUsers() throws Exception
	{
			
			return adminservice.getAllUsers();
	}
	
	
	@RequestMapping(path = "/admin/getuser/{id}", method = RequestMethod.GET)
	public User getuser(@PathVariable("id")long id) throws ResourceNotFoundException{
		User user;
		try {
			user=adminservice.getUserById(id);
			return user;
		}
		catch(Exception e) {
			throw new ResourceNotFoundException("User not found for this id :: " + id);
		
		}
	}
	
	@RequestMapping(path = "/admin/deleteuser/{id}", method = RequestMethod.DELETE)
	public void deleteuser(@PathVariable("id") long id) throws ResourceNotFoundException
	{
		try {
			adminservice.deleteById(id);
		}
		catch(Exception e) {
			throw new ResourceNotFoundException("User not found for this id :: " + id);
			
		}
			
	}
	
	@GetMapping(path = "/accounts/{accountId}/transactions")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Transaction> retrieveAccountTransactions(@PathVariable int accountId) {
        //PrimaryAccount account = primaryAccountDao.findByAccountNumber(accountId);
		/*
		 * if (!account.isPresent()) { throw new AccountNotFoundException(
		 * String.format("Account %s not found.", accountId)); }
		 */
        return transactionService.retrieveTransactionsForAccount(accountId);
    }
	
	
}
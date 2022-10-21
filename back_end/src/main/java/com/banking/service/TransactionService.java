package com.banking.service;

import java.util.List;

import com.banking.model.PrimaryAccount;
import com.banking.model.Transaction;


/**
 * Service stub for transaction related functions
 * @author I325480
 *
 */
public interface TransactionService {

    /**
     * Finds all transactions for an account
     * @param accountId - Unique account ID
     * @return List of transactions for an account
     */
    //public List<Transaction> retrieveTransactionsForAccount(long accountId);
    
    /**
     * Transfers money from one account to another
     * @param transaction - Container object which stores details regarding transaction
     */
    public void transferMoney(Transaction transaction);
    
    public int retreiveAccountNumber(Long id);

	List<Transaction> retrieveTransactionsForAccount(int accountNumber);
}

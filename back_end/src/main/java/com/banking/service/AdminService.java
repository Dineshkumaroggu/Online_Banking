package com.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.dao.MyRepo;
import com.banking.model.User;

@Service
public class AdminService {
	@Autowired
com.banking.dao.MyRepo repo;
	
	public List<User> getAllUsers(){
		return (List<User>) repo.findAll();
		
	}
	
	public User getUserById( long id) {
		return repo.findById(id);
		
	}
	
	public void deleteById(long id) {
		repo.delete(repo.findById(id));
		
	}	
	
}

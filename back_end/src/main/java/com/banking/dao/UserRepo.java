package com.banking.dao;

import org.springframework.data.repository.CrudRepository;

import com.banking.model.User;

public interface UserRepo extends CrudRepository<User, Long> {
	User findByMailid(String mailid);

	User findByFullname(String name);
}

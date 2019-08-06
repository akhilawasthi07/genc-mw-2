package com.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.UserDAO;
import com.demo.model.User;

@Repository
public class UserRepository {
	
	@Autowired
	UserDAO userDao;
	

	public UserDAO getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}


	public List<User> getUsers(){
		return userDao.listAllUsers();
	}
}

package com.example.demo.service.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.UserRegistry;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Transactional
	@Override
	public List<UserRegistry> getUsers() {
		return this.userDao.getUsers();
	}
	@Transactional
	@Override
	public String saveUsers(UserRegistry userRegistry) {
		return this.userDao.saveUsers(userRegistry);
	}

}

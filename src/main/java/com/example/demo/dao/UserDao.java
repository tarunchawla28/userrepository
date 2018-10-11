package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.UserRegistry;

public interface UserDao {
	public List<UserRegistry> getUsers();
	public String saveUsers(UserRegistry userRegistry);
}

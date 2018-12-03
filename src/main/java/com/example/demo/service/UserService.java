package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UserRegistry;

public interface UserService {
	public List<UserRegistry> getUsers();
	public String saveUsers(UserRegistry userRegistry);
}

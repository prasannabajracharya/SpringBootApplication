package com.example.service;

import com.example.domain.User;

public interface IUserService extends IService<User>{
	public User findByUsername(String username);
}

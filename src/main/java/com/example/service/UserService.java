package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserRepository;
@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User add(User user) {
		return userRepository.save(user);
	}

	@Override
	public User update(User user, Long id) {
		user.setId(id);
		return userRepository.save(user);
	}

	@Override
	public User delete(User user) {
		userRepository.delete(user);
		return user;
	}

	@Override
	public User get(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}

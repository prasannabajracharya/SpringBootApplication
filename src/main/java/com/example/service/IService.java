package com.example.service;

import java.util.List;

public interface IService<T> {

	T add(T t);
	
	T update(T t, Long id);
	
	T delete(T t);
	
	T get(Long id);
	
	List<T> getAll();
}

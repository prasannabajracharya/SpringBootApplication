package com.example.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface IController<T> {

	ResponseEntity<String> add(T t);
	 
	 T update(T t, Long id);
	 
	 T delete(T t);
	 
	 T get(Long id);
	 
	 List<T> getAll();
}

package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {
	
	Iterable<User> findAll();
	
	User findById(Long id);
	
	User create(User userToCreate);
	
	User update(User userToUpdate, Long id);
	
	void delete(Long id);
}

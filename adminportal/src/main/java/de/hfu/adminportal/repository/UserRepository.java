package de.hfu.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import de.hfu.adminportal.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
}

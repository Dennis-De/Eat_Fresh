package de.hfu.adminportal.service;

import java.util.Set;

import de.hfu.adminportal.domain.User;
import de.hfu.adminportal.domain.security.UserRole;

public interface UserService {
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);

}

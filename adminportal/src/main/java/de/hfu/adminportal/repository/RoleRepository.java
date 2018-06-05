package de.hfu.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import de.hfu.adminportal.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByName(String name);
}

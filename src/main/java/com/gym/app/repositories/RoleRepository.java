package com.gym.app.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gym.app.entities.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, String>
{
	Optional<Role> findById(String id);
	Role findByRole(String role);
}

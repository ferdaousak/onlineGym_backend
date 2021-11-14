package com.gym.app.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gym.app.entities.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, String>
{
	Optional<Admin> findById(String id);
}

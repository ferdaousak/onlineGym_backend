package com.gym.app.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gym.app.entities.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> 
{
	Optional<User> findById(String id);
	
	User findByEmail(String email);
}

package com.example.ejePost.controller.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoUser extends CrudRepository<User, Long> {

	public List<User> findByusername(String username);
}

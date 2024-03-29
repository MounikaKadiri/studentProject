package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Long> {

	public User findById(long id);
	
}

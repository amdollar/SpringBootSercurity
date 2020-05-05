package com.example.springboot.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.Model.User;

public interface Repository extends JpaRepository<User, Integer>{
		Optional<User> findByUsername(String username);
}

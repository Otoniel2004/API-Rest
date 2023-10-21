package com.myproject.springpoject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.springpoject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}

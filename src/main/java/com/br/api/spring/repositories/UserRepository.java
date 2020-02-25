package com.br.api.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.api.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

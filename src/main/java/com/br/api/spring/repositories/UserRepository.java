package com.br.api.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.api.spring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

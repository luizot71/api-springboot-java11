package com.br.api.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.api.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
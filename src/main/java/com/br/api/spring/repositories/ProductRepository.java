package com.br.api.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.api.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
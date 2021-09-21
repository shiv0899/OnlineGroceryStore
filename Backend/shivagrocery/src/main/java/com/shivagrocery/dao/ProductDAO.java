package com.shivagrocery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivagrocery.entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

}

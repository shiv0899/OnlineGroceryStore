package com.shivagrocery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivagrocery.entity.Admin;

@Repository
public interface AdminDAO extends JpaRepository<Admin, String>{

}

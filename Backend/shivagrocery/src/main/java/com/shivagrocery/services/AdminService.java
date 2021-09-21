package com.shivagrocery.services;

import java.util.Optional;

import com.shivagrocery.entity.Admin;

public interface AdminService {

	int addNewAdmin(Admin admin);

	Optional<Admin> viewAdmindetail(Admin admin);

	boolean editAdminDetail(Admin admin);

	boolean deleteAdminDetails(Admin admin);

}

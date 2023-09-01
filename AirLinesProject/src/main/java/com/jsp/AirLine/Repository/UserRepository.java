package com.jsp.AirLine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.AirLine.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	
}

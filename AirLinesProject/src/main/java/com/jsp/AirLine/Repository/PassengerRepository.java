package com.jsp.AirLine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.AirLine.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

	
}

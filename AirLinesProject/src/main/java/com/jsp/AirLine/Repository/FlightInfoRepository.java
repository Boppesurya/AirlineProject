package com.jsp.AirLine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.AirLine.Entity.Flight_Info;

public interface FlightInfoRepository extends JpaRepository<Flight_Info, Integer>{

}

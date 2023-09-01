package com.jsp.AirLine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.AirLine.Entity.Fare;

public interface FareRepository  extends JpaRepository<Fare, Integer> {

}

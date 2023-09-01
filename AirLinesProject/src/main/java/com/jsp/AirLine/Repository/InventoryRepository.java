package com.jsp.AirLine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.AirLine.Entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

}

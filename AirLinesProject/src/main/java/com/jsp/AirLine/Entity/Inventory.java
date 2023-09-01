package com.jsp.AirLine.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "inventory_table")
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int inventoryId;
   private int count;
  
   @OneToOne(cascade =CascadeType.ALL,mappedBy = "inventory",fetch = FetchType.EAGER)
   private Flight flight;
}

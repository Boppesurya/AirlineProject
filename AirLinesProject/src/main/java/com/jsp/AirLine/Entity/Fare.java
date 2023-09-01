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
@Table(name = "fare_table")

public class Fare {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fareId;
	private String currency;
	private double amount;
	 
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "fare",fetch = FetchType.EAGER)
	private Flight flight;
	
}

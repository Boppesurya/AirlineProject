package com.jsp.AirLine.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "bookingInfo_table")
public class BookingInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	private String bookingDate;
	private String Destination;
	private double cost;
	private String   flightDate;
	private String status;
	private String flightTime;
	private String currentCity;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "bookingInformation",fetch =FetchType.EAGER )
	private List<Passenger> passenger;
}
 
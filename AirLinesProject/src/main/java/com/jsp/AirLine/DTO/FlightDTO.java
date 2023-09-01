package com.jsp.AirLine.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FlightDTO {
	
	
	private String distination;
	private String flightDate;
	private int flightNo;
	private String flightTime;
	private String currentLocation; 
	
	private FareDTO fareDTO;
	
	private Flight_Info_DTO flight_Info_DTO;
	
	private InventoryDTO inventoryDTO;

}

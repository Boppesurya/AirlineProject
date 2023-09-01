package com.jsp.AirLine.DTO;

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
public class CheckinDTO {

	private int seatNo;
	private int gateNo;
	
	private PassengerDTO passengerDTO;
}

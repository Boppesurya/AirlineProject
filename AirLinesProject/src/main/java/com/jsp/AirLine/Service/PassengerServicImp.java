package com.jsp.AirLine.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.AirLine.DTO.PassengerDTO;
import com.jsp.AirLine.Entity.BookingInformation;
import com.jsp.AirLine.Entity.Checkin;
import com.jsp.AirLine.Entity.Passenger;
import com.jsp.AirLine.Repository.PassengerRepository;
@Service
public class PassengerServicImp implements PassengerService {
  @Autowired
	private PassengerRepository passengerRepository;
	//@Override
//	public int addPassenger(PassengerDTO passengerDTO) {
//		Passenger passenger = passengerRepository .save(Passenger.builder()
//				                                    .firstName(passengerDTO.getFirstName())
//				                                    .lastName(passengerDTO.getLastName())
//				                                    .mobileNo(passengerDTO.getMobileNo())
//				                                    .gender(passengerDTO.getGender())
//				                                    .bookingInformation(BookingInformation.builder()
//				                                    		.bookingDate(passengerDTO.getBookingInfoDTO().getBookingDate())
//				                                    		.Destination(passengerDTO.getBookingInfoDTO().getDestination())
//				                                    		.currentCity(passengerDTO.getBookingInfoDTO().getCurrentCity())
//				                                    		.cost(passengerDTO.getBookingInfoDTO().getCost())
//				                                    		.flightDate(passengerDTO.getBookingInfoDTO().getFlightDate1())
//				                                    		.flightTime(passengerDTO.getBookingInfoDTO().getFlightTime())
//				                                    		.status(passengerDTO.getBookingInfoDTO().getStatus())
//				                                    		.build())
//				                                    .checkin(Checkin.builder()
//				                                    		.gateNo(passengerDTO.getCheckinDTO().getGateNo())
//				                                    		.seatNo(passengerDTO.getCheckinDTO().getSeatNo())
//				                                    		.build())
//				                                              .build());
//	return 1;
//	}

}

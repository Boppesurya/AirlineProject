package com.jsp.AirLine.Service;

import java.util.List;

import com.jsp.AirLine.DTO.AirLine_Info_DTO;
import com.jsp.AirLine.DTO.FareDTO;
import com.jsp.AirLine.DTO.FlightDTO;
import com.jsp.AirLine.DTO.Flight_Info_DTO;
import com.jsp.AirLine.DTO.InventoryDTO;
import com.jsp.AirLine.Entity.Flight;

public interface AdminService {
	int addAirlineinfo(AirLine_Info_DTO airlinedto);
	int addfair(FareDTO fairdto);
	int addinventatory(InventoryDTO inventatorydto);
	int addflightinfo(Flight_Info_DTO flightinfodto,int airlineid);
	int addflight(FlightDTO flightColumndto,int fareId,int flightInfoId,int inventoryId);
	//the below the process by using airlineid,flightid by the retreive.
	FlightDTO findFlightById(int flightId);
	AirLine_Info_DTO findAirlineById(int airLineId);
	//we have to do update operation based on airlineid and airlinename
	AirLine_Info_DTO updateAirlineNameByid(int airlineid,String airlinename);
	//we have to do update operation based on flightid and flightno
	FlightDTO updateFlightNameByid(int flighid,int flightno);
	//we have to do delete the flights 
	int deleteFlights(int flightid);
	//we have to do delete opeation by airline
	int deleteAirline(int airlineid);
	//List<Bookinginfodto> getAllBookingDetails();
	//create one API,to search the flight based on starting location,desination,flightdate,flighttime
	List<Flight> searchFlight(String currentLoc,String destination,String flightdate,String flighttime);

}

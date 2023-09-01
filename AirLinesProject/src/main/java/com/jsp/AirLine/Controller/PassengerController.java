package com.jsp.AirLine.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.AirLine.Service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	@Autowired
	private PassengerService passengerService;
//	@PostMapping("/v1")
//	public ResponseEntity<String> addpassenger(@RequestBody PassengerDTO passengerDTO){
//		int id = passengerService.addPassenger(passengerDTO);
//		return ResponseEntity.status(HttpStatus.CREATED).body("Id is"+id);
//	}

}

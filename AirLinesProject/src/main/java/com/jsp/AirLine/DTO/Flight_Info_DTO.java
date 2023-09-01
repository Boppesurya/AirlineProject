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
public class Flight_Info_DTO {
    private int flightNo;
    private String flightTime;
    private String type;
    
    private  FlightDTO flightDto;
    
    private AirLine_Info_DTO airLine_Info_DTO;
    
}

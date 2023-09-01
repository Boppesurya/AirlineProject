package com.jsp.AirLine.DTO;

import java.util.List;

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
public class AirLine_Info_DTO {
   private String airlineName;
   
   private List<Flight_Info_DTO> flight_Info_dto;
   
}

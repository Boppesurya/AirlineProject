package com.jsp.AirLine.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "flightInfo_table")
public class Flight_Info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightInfoId;
	private int flightNo;
	private String flightTime;
	private String type;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy ="flight_Info",fetch = FetchType.EAGER)
	private Flight flight;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "airlineId")
	private AirlLine_Info  airlLine_Info;
}

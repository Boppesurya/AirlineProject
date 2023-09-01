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
@Table(name = "airLine_info")
public class AirlLine_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airLineId;
	private String airLineName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "airlLine_Info",fetch = FetchType.EAGER)
	private List<Flight_Info> flight_Info;
}

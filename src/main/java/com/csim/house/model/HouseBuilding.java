package com.csim.house.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.csim.house.model.parameters.HouseStatus;
import com.csim.house.model.parameters.HouseSubType;
import com.csim.house.model.parameters.HouseType;

import lombok.Data;

@Data
@Document(collection="house-management")
public class HouseBuilding implements Serializable{

	private static final long serialVersionUID = -7033805800230331248L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger id;
	
	private HouseType type;
	private HouseSubType subType;
	private HouseStatus status;
	private Double generatedValue;
	private Location location;
	private String comment;
}

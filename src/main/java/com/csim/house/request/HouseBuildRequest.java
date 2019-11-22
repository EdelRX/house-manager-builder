package com.csim.house.request;

import java.io.Serializable;

import com.csim.house.model.parameters.HouseSubType;
import com.csim.house.model.parameters.HouseType;

import lombok.Data;

@Data
public class HouseBuildRequest implements Serializable{
	
	private static final long serialVersionUID = -2311224061055110287L;
	
	private HouseType type;
	private HouseSubType subType;
	private int horizontalCoord;
	private int verticalCoord;
}

package com.csim.house.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Location implements Serializable{

	private static final long serialVersionUID = 3771637991762954046L;
	
	private int xCoord;
	private int yCoord;
}

package com.csim.house.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csim.house.model.HouseBuilding;
import com.csim.house.model.Location;
import com.csim.house.model.parameters.HouseStatus;
import com.csim.house.repositories.HouseBuildingRepository;
import com.csim.house.request.BuildRequest;

@Service
public class HouseService {

	@Autowired
	HouseBuildingRepository houseBuildingRepository;

	public boolean buildHouse(BuildRequest buildRequest) {

		boolean result;

		try {
			HouseBuilding houseBuilding = new HouseBuilding();

			houseBuilding.setType(buildRequest.getType());
			houseBuilding.setSubType(buildRequest.getSubType());

			Location location = new Location();
			location.setXCoord(buildRequest.getHorizontalCoord());
			location.setYCoord(buildRequest.getVerticalCoord());

			houseBuilding.setLocation(location);
			houseBuilding.setStatus(HouseStatus.CONSTRUCTED);
			houseBuilding.setComment("Recently finished construction");

			houseBuildingRepository.save(houseBuilding);

			result = true;

		} catch (Exception e) {
			result = false;
		}

		return result;
	}
}

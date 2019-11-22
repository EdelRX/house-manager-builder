package com.csim.house.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.csim.house.model.HouseBuilding;

@Repository
public interface HouseBuildingRepository extends MongoRepository<HouseBuilding,Long>{
	
}

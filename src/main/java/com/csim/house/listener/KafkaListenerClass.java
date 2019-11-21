package com.csim.house.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.csim.house.request.BuildRequest;
import com.csim.house.service.HouseService;

@Component
public class KafkaListenerClass {
	
	@Autowired
	HouseService houseService;
	
	@KafkaListener(topics = "topic_test_1")
	public void run(@Payload BuildRequest buildRequest) {
		houseService.buildHouse(buildRequest);
	}

}

package com.jisungmsa.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
	
	/*
	 * post 로 변령요청을 해야한다
	 * http://localhost:8088/actuator/refresh */
	
	@Value("${jisungmsa.value}")
	private String configStr;
	
	@GetMapping("/test")
	public String test() {
		
		return configStr;
		
	}

}

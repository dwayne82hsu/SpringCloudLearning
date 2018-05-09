package cn.com.dawn.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHiWithHystric implements IServiceHi {

	public String sayHiFromService(String name) {
		return "sorry " + name;
	}

}

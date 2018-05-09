package cn.com.dawn.servicefeign.controller;

import cn.com.dawn.servicefeign.service.IServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Autowired
	IServiceHi serviceHi;
	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name){
		return serviceHi.sayHiFromService(name);
	}
}

package cn.com.dawn.serviceribbon.controller;

import cn.com.dawn.serviceribbon.service.HelloServiceImpl;
import cn.com.dawn.serviceribbon.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	HelloServiceImpl helloService;
	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name){
		return helloService.hiService(name);
	}


}

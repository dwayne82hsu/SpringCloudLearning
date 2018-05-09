package cn.com.dawn.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = FeignServiceHiWithHystric.class)
public interface IServiceHi {
	@GetMapping(value = "/hi")
	String sayHiFromService(@RequestParam(value = "name") String name);
}

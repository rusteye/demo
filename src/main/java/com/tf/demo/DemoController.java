package com.tf.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	private static Logger log = LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping("/hello")
	public String testDemo() {
		log.info("test success");
		return "hello";
	}
	
	@RequestMapping("/test")
	public String test() {
		log.info("test success");
		return "success";
	}
}

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
		log.info("test hello");
		return "test hello dev";
	}
	
	@RequestMapping("/test")
	public String test() {
		log.info("test success");
		return "test success dev";
	}
	
	@RequestMapping("/test2")
	public String test2() {
		log.info("test2 success");
		return "test2 success dev";
	}
}

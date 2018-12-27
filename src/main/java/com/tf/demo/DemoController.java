package com.tf.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	private static Logger log = LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping("/hello")
	public String testDemo2() {
		log.info("test success");
		return "hello";
	}
}

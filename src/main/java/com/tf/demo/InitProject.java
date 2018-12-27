package com.tf.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class InitProject implements ApplicationRunner{

	private static Logger log = LoggerFactory.getLogger(InitProject.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		String os = System.getProperty("os.name");
		System.out.println(os);
		if(!os.toLowerCase().startsWith("win")){
			for(int i=0 ; i<=10000 ; i++) {
				try {
					Thread.sleep(1000);
					log.info("test revoke");
					System.out.println("test revoke");
					ResponseEntity<String> entity = restTemplate.getForEntity("http://eval-mesh.tongfangspaccetest:8088/eval/1/1", String.class);
					System.out.println(entity.getBody());
					log.info(entity.getBody());
				} catch (Exception e) {
					System.out.println(e.getMessage());
					log.error(e.getMessage(), e);
				}
			}
		}
	}
	
}

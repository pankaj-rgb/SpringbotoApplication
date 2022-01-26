package com.springbootdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication

public class SpingbotoAppplicatoinApplication extends SpringBootServletInitializer {

	

	private static final Logger logger=LogManager.getLogger(SpingbotoAppplicatoinApplication.class);
	public static void main(String[] args) {
		logger.debug("this is debug ");
		logger.info("this is info ");
		logger.warn("this is warn ");
		logger.error("this is error ");
		logger.fatal("this is fatal ");
		SpringApplication.run(SpingbotoAppplicatoinApplication.class, args);
		
	}


	

}

package com.sac.api;

import com.sac.api.manager.SaveManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SATApplication {

	static final Logger logger = LoggerFactory.getLogger("START");

	public static void main(String[] args) {
		logger.info("Initializing the managers ...");
		SaveManager.init();
		logger.info("done.");

		SpringApplication.run(SATApplication.class, args);

	}

}

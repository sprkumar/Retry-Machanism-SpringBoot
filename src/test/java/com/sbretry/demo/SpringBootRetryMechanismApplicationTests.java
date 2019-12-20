package com.sbretry.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sbretry.demo.service.RetryService;

/**
 * @author ravindra
 *
 */
@SpringBootTest
class SpringBootRetryMechanismApplicationTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootRetryMechanismApplicationTests.class);

	@Autowired
	RetryService retryService;
	
	@Test
	void retryServiceTest() {
		LOGGER.info("inside SpringBootRetryMechanismApplicationTests.retryServiceTest");
		try {
			final String message = retryService.retryWhenException();
			LOGGER.info("message = "+message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

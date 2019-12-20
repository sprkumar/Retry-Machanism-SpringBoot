package com.sbretry.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @author ravindra
 *
 */
@Service
public class RetryService {
	private static final Logger LOGGER = LoggerFactory.getLogger(RetryService.class);
	private static int COUNTER=0;
	
	@Retryable(value = {RuntimeException.class}, maxAttempts = 4, backoff = @Backoff(5000))
	public String retryWhenException() {
		COUNTER++;
		LOGGER.info("COUNTER = "+COUNTER);
		if(COUNTER==1) 
			throw new RuntimeException();		
		if(COUNTER==2) 
			throw new RuntimeException();
		else throw new RuntimeException();		
	}
		public String recover(Throwable t) {
			LOGGER.info("RetryService.recover ");
		return "Error class :: "+t.getClass().getName();
	}
}

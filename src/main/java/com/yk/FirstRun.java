package com.yk;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
@Service
public class FirstRun {
	@PostConstruct
	public void cc(){
		System.out.println("@PostConstruct...");
		new A().aa();
	}
	
	@PreDestroy
	public void dd(){
		System.out.println("@PreDestroy...");
	}

}

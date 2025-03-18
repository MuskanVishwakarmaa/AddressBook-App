package com.example.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@ComponentScan(basePackages = "com.example.addressbook")
@SpringBootApplication
public class AddressbookApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AddressbookApplication.class, args);
		String activeProfile = context.getEnvironment().getActiveProfiles().length>0
				? context.getEnvironment().getActiveProfiles()[0]
				: "default";
		log.info("Address Book App Started in {} environment", activeProfile);
	}

}

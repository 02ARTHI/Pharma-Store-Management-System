package com.learning.PharmaStoreManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@OpenAPIDefinition(
//		info=@Info(title="Ticket Booking API",
//		version="1.0",
//		description="This API is to book ticket"),
//		
//		servers=@Server(
//				url="http://localhost:8484/TicketBookingApp",
//				description="This is the server where our API is deployed ")			
//				)
public class PharmaStoreManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmaStoreManagementApplication.class, args);
	}

}

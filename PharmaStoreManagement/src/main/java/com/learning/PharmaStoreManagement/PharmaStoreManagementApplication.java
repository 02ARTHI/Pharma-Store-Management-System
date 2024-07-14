package com.learning.PharmaStoreManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;



@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(title="Pharmacy Inventory Management API",
		version="1.0",
		description="This API is to keep track of medicine product that is available and in saleable within our pharmacy"),
		
		servers=@Server(
				url="http://localhost:9097/",
				description="This is the server where our API is deployed ")			
				)
public class PharmaStoreManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmaStoreManagementApplication.class, args);
	}

}

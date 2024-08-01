package com.Ecomm.prissy;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(
		info = @Info(
				title = "Ecommerce for Sayon",
				description = "Backend REST APIS for Product management",
				version = "Version 1",
				contact = @Contact(
						name = "Priscilla Njoki",
						email = "backend@gmail.com",
						url = "backend@gmail.com"
				),
				license = @License(
						name = "Priscilla's Ecommerce",
						url = "backend@gmail.com"

				)

		),
		externalDocs = @ExternalDocumentation(
				description = "Pressure cooker Documentation",
				url = "https://services.io/")

)
@SpringBootApplication
public class EcommerceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
	}

}

package br.com.bcp.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationBcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationBcpApplication.class, args);
	}

}

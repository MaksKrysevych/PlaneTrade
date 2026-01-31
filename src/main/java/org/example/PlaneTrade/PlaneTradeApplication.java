package org.example.PlaneTrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PlaneTradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaneTradeApplication.class, args);
	}

}

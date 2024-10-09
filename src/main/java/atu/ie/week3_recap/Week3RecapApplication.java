package atu.ie.week3_recap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Week3RecapApplication {
	public static void main(String[] args) {
		SpringApplication.run(Week3RecapApplication.class, args);
	}
}

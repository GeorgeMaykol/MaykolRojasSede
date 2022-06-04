package com.idat.MaykolRojasSede;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MaykolRojasSedeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaykolRojasSedeApplication.class, args);
	}

}

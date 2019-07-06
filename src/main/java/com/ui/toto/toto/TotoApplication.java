package com.ui.toto.toto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = {"*", "null"})
@SpringBootApplication
public class TotoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TotoApplication.class, args);
	}

}

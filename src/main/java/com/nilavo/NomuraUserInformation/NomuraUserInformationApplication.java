package com.nilavo.NomuraUserInformation;

import com.nilavo.NomuraUserInformation.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NomuraUserInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NomuraUserInformationApplication.class, args);

		Person p = new Person(1,"Nilavo","BuroshibTala","741303");

		System.out.println(p);
	}

}

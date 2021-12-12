package com.company.engage;

import com.company.engage.Models.Proficiency;
import com.company.engage.Models.Skill;
import com.company.engage.Models.LanguagePreference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication

public class EngageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EngageApplication.class, args);
	}

}

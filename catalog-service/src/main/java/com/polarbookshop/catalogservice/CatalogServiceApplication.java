package com.polarbookshop.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

	//Identifica uma classe que define manipuladores para endpoints REST/HTTP
	@RestController
	public class HomeController {

		//Lida com solicitações GET para o endpoint raiz
		@GetMapping("/")
		public String getGreeting() {
			return "Bem-vindo ao catálogo de livros!";
		}
	}
}

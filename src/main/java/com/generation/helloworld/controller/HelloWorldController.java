package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping("/1")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/2")
	public String bsmGenerarion() {
		return "1 - O Poder da Responsabilidade Pessoal, 2 - Persistencia, 3 - Orientação a detalhe, 4 - Comunicação, 5 - Trabalho em Equipe, 6 - Orientação ao Futuro, 7 - Mentalidade de Crescimento, 8 - Proatividade ";
	}
	
	@GetMapping("/3")
	public String aprendizadosGeneration() {
		return "1 - Aprender a parte das applications para que serve, como utilizar/configurar, 2 - o que é o TomCat, como utilizar, 3 - aprender sobre Swagger, 4 - aprender como e para que o Docker funciona, 5 - entender um pouco sobre CI/CD, 6 - Aprender os conceitos SOLID e como pode auxiliar no dia a dia ";
	}

}

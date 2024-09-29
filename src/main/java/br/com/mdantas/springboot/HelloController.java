package br.com.mdantas.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author marcelo.dantas
 */

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Olá, Spring Boot!";
    }
}

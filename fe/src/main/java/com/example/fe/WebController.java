package com.example.fe;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public String helloWorld() {

        String response = restTemplate.getForObject("http://localhost:8082", String.class);
        return "<h1>Hello from the " + response + "!</h1>";
    }

}

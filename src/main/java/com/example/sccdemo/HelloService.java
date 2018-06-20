package com.example.sccdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    private static final Logger LOG = LoggerFactory.getLogger(HelloService.class);

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", required = true) String name){
        LOG.debug("Given name for Hello is {}", name);
        return "Hello " + name;
    }

    @GetMapping("/bonjour/{name}")
    public String sayBonjour(@PathVariable("name") String name){
        LOG.debug("Given name for Bonjour is {}", name);
        return "Bonjour " + name;
    }

    @GetMapping("/validate/prime")
    public String isNumberPrime(@RequestParam("number") String number) {
        return Integer.parseInt(number) % 2 == 0 ? "Even" : "Odd";
    }
}

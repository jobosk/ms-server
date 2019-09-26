package com.alfatecsistemas.ms.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/server")
public class GreeterController {

  @Value("${server.port:#{null}}")
  private String port;

  final static List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");

  @RequestMapping(value = "/greetings")
  public String greet() {
    return "Server " + port + " says: " + greetings.get(new Random().nextInt(greetings.size()));
  }

}

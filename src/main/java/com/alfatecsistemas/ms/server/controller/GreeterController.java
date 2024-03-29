package com.alfatecsistemas.ms.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/greeter")
public class GreeterController {

  final String podName = System.getenv("HOSTNAME");
  final static List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");

  @GetMapping(value = "/greet")
  public String greet() {
    try {
      Thread.sleep(1000);
    } catch (final Exception e) {
      return "Waiting error";
    }
    return "Server " + podName + " says: " + greetings.get(new Random().nextInt(greetings.size()));
  }

}

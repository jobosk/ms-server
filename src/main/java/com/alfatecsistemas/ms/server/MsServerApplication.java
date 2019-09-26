package com.alfatecsistemas.ms.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsServerApplication {

  public static void main(final String[] args) {
    SpringApplication.run(MsServerApplication.class, args);
  }

}

package com.bmw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

}

/*
   1.    @SpringBootApplication  = @configuration + @EnableAutoConfiguration + @ComponentScan 
   
  ***  @Configuration  ****

* @Configuration annotation helps in Spring annotation based configuration.

* @Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by
  the Spring container to generate bean definitions and service requests for those beans at runtime.

* Since spring 2, we were writing our bean configurations to xml files. But Spring 3 gave the freedom to
  move bean definitions out of xml files. we can give bean definitions in Java files itself. This is called 
   Spring Java Config feature (using @Configuration annotation).
 
 
* ---> ***  @EnableAutoConfiguration ***


*  @EnableAutoConfiguration annotation tells Spring Boot to "guess" how you want to configure Spring, based 
    on the jar dependencies that you have added.

* @EnableAutoConfiguration annotation auto-configures the beans that are present in the classpath. 
 This simplifies the developer work by guessing the required beans from classpath and configures to run the 
 application.

* For example, If H2 is on your classpath, and you have not manually configured any database connection beans,
  then Spring will auto-configure an in-memory database.


*  --> ***  @ComponentScan  ***

*  @ComponentScan tells Spring to look for other components, configurations, and services in the specified
   package.

* Spring is able to auto scan, detect and register your beans or components from pre-defined project package.

* If no package is specified current class package is taken as the root package.
 
  
 */
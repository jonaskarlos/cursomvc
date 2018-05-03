package com.jonas.cursomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration
                       // @ComponentScan
public class CursomvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursomvcApplication.class, args);
	}

	/*
	 * @Bean public HttpMessageConverters customConverters() {
	 * 
	 * Collection<HttpMessageConverter<?>> messageConverters = new
	 * ArrayList<>();
	 * 
	 * GsonHttpMessageConverter gsonHttpMessageConverter = new
	 * GsonHttpMessageConverter();
	 * messageConverters.add(gsonHttpMessageConverter);
	 * 
	 * return new HttpMessageConverters(true, messageConverters); }
	 */
}

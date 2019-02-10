package com.hackfse.feedbackmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.hackfse")
@ImportResource("classpath:META-INF/persistence.xml")
public class FeedbackmanagementApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackmanagementApplication.class, args);
	}
	
	/*@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory(){
	     LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
	    factoryBean.setPersistenceUnitName("sampleManager");
	    return factoryBean;
	}*/
}


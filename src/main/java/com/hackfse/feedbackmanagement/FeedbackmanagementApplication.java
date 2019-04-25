package com.hackfse.feedbackmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication(scanBasePackages="com.hackfse.feedbackmanagement")
@EnableWebSecurity
@ComponentScan(basePackages={"com.hackfse.feedbackmanagement"})
public class FeedbackmanagementApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("TEst12 345090iiikkklll>>>>>>>>");
		SpringApplication.run(FeedbackmanagementApplication.class, args);
	}
	
	/*@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory(){
	     LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
	    factoryBean.setPersistenceUnitName("sampleManager");
	    return factoryBean;
	}*/
}


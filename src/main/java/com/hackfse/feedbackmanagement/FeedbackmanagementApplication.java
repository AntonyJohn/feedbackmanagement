package com.hackfse.feedbackmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.hackfse.feedbackmanagement")
@EnableWebSecurity
@ComponentScan(basePackages={"com.hackfse.feedbackmanagement"})
public class FeedbackmanagementApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("TEst >>>>>>>>");
		SpringApplication.run(FeedbackmanagementApplication.class, args);
	}
	
	/*@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory(){
	     LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
	    factoryBean.setPersistenceUnitName("sampleManager");
	    return factoryBean;
	}*/
}


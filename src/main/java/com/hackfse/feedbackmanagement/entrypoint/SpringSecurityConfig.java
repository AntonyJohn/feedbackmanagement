package com.hackfse.feedbackmanagement.entrypoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	private static final String REALM = "realm";

    @Autowired
    private CustomAuthenticationProvider authProvider; 

    @Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .logout()
            .and()
            // default with authentication
            .authorizeRequests().anyRequest().authenticated()
            .and()
            .csrf()            
            .and().httpBasic().realmName(REALM).authenticationEntryPoint(getBasicAuthEntryPoint());
    }

    @Bean
    BasicAuthenticationEntryPoint getBasicAuthEntryPoint() {
        BasicAuthenticationEntryPoint basicAuth = new BasicAuthenticationEntryPoint();
        basicAuth.setRealmName(REALM);
        return basicAuth;
    }
}

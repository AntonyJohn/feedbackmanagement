/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackfse.feedbackmanagement.entrypoint;

import com.hackfse.feedbackmanagement.Log;
import com.hackfse.feedbackmanagement.login.dataobject.Users;
import com.hackfse.feedbackmanagement.login.service.LoginService;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 *
 * @author antony
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private LoginService loginService;
    
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	System.out.println("Start:: CustomUserDetailsService --> loadUserByUsername()");     
    	Users user = loginService.findUserByName(new Users(),userName);
	    if(user == null){
	        throw new UsernameNotFoundException("UserName "+userName+" not found");
	    } 
	    return new SecurityUser(user);
    }
}

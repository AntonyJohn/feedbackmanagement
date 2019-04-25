/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackfse.feedbackmanagement.login.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hackfse.feedbackmanagement.Log;
import com.hackfse.feedbackmanagement.login.dataobject.Employee;
import com.hackfse.feedbackmanagement.login.service.EmployeeService;

/**
 *
 * @author antony
 */

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    
	private static @Log Logger LOG;	
	Employee emp;
    
    @Autowired
    private EmployeeService employeeService;
    
    //Retrieve User Details	
    @RequestMapping(value="/retrieveEmployee", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public@ResponseBody Employee  retrieveEmployee(@RequestParam("empID") String empID){					

    	LOG.info("Start:: EmployeeController1 --> retrieveEmployee()");    	
        emp = new Employee();       
        emp.setId(new Integer(empID));
        Employee obj=employeeService.retrieveEmployee(emp,emp.getId());
        LOG.info("End:: EmployeeController --> retrieveEmployee()");
        return obj;				 
    }
    
    //Retrieve User Details	
    @RequestMapping(value="/retrieveAllEmployee", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public@ResponseBody List<Employee>  retrieveAllEmployee(){					
    	LOG.info("Start:: EmployeeController --> retrieveAllEmployee()");  
        emp = new Employee();
        List<Employee> obj=employeeService.retrieveAllEmployee(emp); 
        LOG.info("End:: EmployeeController --> retrieveAllEmployee()");
        return obj;				 
    }
    
    
}

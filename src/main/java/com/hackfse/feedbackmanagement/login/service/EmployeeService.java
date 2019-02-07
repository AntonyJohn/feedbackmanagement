/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackfse.feedbackmanagement.login.service;

import com.hackfse.feedbackmanagement.Log;
import com.hackfse.feedbackmanagement.login.dao.EmployeeDao;
import com.hackfse.feedbackmanagement.login.dataobject.Employee;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author antony
 */

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeDao employeeDao;    
    private static @Log Logger LOG;	
    
    @SuppressWarnings({ "unchecked" })
    public Employee retrieveEmployee(Employee empDo, Integer empId) {
    	LOG.info("EmployeeService --> retrieveEmployee()");
        return employeeDao.get((Class<Employee>) empDo.getClass(),empId);                                      
    }
    
    @SuppressWarnings({ "unchecked" })
    public List<Employee> retrieveAllEmployee(Employee empDo) {
    	LOG.info("EmployeeService --> retrieveAllEmployee()");
        return (List<Employee>) employeeDao.getAll((Class<Employee>) empDo.getClass());                                      
    }
}

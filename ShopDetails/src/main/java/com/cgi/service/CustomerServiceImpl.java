package com.cgi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.dao.CustomerDAO;
import com.cgi.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
    CustomerDAO dao;
   public void customerAdd(Customer customer)
   {
        dao.customerAdd(customer);
   }
}

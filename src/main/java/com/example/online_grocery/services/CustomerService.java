package com.example.online_grocery.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.online_grocery.Entities.Customer;

@Service
public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Long id, Customer customerDetails);
    void deleteCustomer(Long id);
    
}

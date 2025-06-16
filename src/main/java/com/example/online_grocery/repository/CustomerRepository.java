package com.example.online_grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_grocery.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}

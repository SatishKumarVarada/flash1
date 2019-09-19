package com.rbs.bank.dao;

import org.springframework.data.repository.CrudRepository;

import com.rbs.bank.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer,Integer> {

}

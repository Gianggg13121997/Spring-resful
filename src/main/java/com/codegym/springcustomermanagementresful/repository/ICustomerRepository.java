package com.codegym.springcustomermanagementresful.repository;

import com.codegym.springcustomermanagementresful.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerMapper {
    Customer queryCustomerById(int id);

    List<Customer> queryCustomersByQueryVo(QueryVo queryVo);

    int queryCustomersByQueryVoCount(QueryVo queryVo);

    void updateCustomer(Customer customer);

    void saveCustomer(Customer customer);

    void deleteCustomer(int customerId);
}

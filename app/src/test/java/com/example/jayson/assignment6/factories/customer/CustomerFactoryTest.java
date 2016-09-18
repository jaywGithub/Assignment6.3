package com.example.jayson.assignment6.factories.customer;

import com.example.jayson.assignment6.domain.customer.Customer;
import com.example.jayson.assignment6.domain.customer.CustomerAddress;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class CustomerFactoryTest {
    @Test
    public void testCreate() throws Exception
    {
        CustomerAddress customerAddress = new CustomerAddress.Builder()
                .areaName("District6")
                .areaCode("8000")
                .cityName("Cape Town")
                .build();

        Customer customer = CustomerFactory.getCustomer("Jayson", "Peters", "0621234567", customerAddress);

        Assert.assertEquals("Jayson", customer.getName());
    }

    @Test
    public void testUpdate()throws Exception
    {
        CustomerAddress customerAddress = new CustomerAddress.Builder()
                .areaName("District6")
                .areaCode("8000")
                .cityName("Cape Town")
                .build();

        Customer customer = CustomerFactory.getCustomer("Jayson", "Peters", "0621234567", customerAddress);
        Customer newCustomer = new Customer
                .Builder()
                .copy(customer)
                .name("Joe")
                .build();

        Assert.assertEquals("Joe", newCustomer.getName());
    }
}

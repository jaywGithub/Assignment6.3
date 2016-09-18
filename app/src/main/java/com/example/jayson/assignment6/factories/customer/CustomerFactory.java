package com.example.jayson.assignment6.factories.customer;

import com.example.jayson.assignment6.domain.customer.Customer;
import com.example.jayson.assignment6.domain.customer.CustomerAddress;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class CustomerFactory {

    public static Customer getCustomer(String name, String surname, String contactNumber, CustomerAddress customerAddress)
    {
        return new Customer.Builder()
                .name(name)
                .surname(surname)
                .contactNumber(contactNumber)
                .customerAddress(customerAddress)
                .build();
    }
}

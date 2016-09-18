package com.example.jayson.assignment6.domain.customer;

import java.io.Serializable;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class Customer implements Serializable {

    private Long id;
    private String name;
    private String surname;
    private String contactNumber;
    private CustomerAddress customerAddress;

    public Customer(){}

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public CustomerAddress getCustomerAddress()
    {
        return customerAddress;
    }

    public Customer(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.contactNumber = builder.contactNumber;
        this.customerAddress = builder.customerAddress;
    }

    public static class Builder
    {
        private Long id;
        private String name;
        private String surname;
        private String contactNumber;
        private CustomerAddress customerAddress;

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder name(String value)
        {
            this.name = value;
            return this;
        }

        public Builder surname(String value)
        {
            this.surname = value;
            return this;
        }

        public Builder contactNumber(String value)
        {
            this.contactNumber = value;
            return this;
        }

        public Builder customerAddress(CustomerAddress value)
        {
            this.customerAddress = value;
            return this;
        }

        public Builder copy(Customer value)
        {
            this.id = value.id;
            this.name = value.name;
            this.surname = value.surname;
            this.contactNumber = value.contactNumber;
            this.customerAddress = value.customerAddress;

            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return id != null ? id.equals(customer.id) : customer.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}


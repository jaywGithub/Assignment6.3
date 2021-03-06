package com.example.jayson.assignment6.factories.employee;

import com.example.jayson.assignment6.domain.employee.Employee;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class EmployeeFactory {

    public static Employee getEmployee(String name, String surname, String license)
    {
        return new Employee.Builder()
                .name(name)
                .surname(surname)
                .license(license)
                .build();
    }
}

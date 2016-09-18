package com.example.jayson.assignment6.services.employeeservices;

import android.content.Context;

import com.example.jayson.assignment6.domain.employee.Employee;

/**
 * Created by JAYSON on 2016-05-08.
 */
public interface EmployeeService {

    String activateAccount(String name, String surname, String license);

    void addEmployee(Context context, Employee employee);

    void updateEmployee(Context context, Employee employee);
}

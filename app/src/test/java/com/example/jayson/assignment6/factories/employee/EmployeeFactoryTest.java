package com.example.jayson.assignment6.factories.employee;

import com.example.jayson.assignment6.domain.employee.Employee;
import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class EmployeeFactoryTest {
    @Test
    public void testCreate() throws Exception
    {
        Employee employee = EmployeeFactory.getEmployee("Jayson", "Peters", "C1");

        Assert.assertEquals("Jayson", employee.getName());
    }

    @Test
    public void testUpdate()throws Exception
    {
        Employee employee = EmployeeFactory.getEmployee("Jayson", "Peters", "C1");
        Employee newEmployee = new Employee
                .Builder()
                .copy(employee)
                .name("Joe")
                .build();

        Assert.assertEquals("Joe", newEmployee.getName());
    }
}

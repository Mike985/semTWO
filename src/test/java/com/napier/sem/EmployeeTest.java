package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

public class EmployeeTest {
    static Employee employee;
    static App app;

    @BeforeAll
    static void init()
    {
        employee = new Employee();
        app = new App();
    }

    @Test
    void employeeNull()
    {
        app.displayEmployee(null);
    }

    @Test
    void employeeEmpty()
    {
        app.displayEmployee(employee);
    }

    @Test
    void displayEmployee()
    {
        employee.first_name="anything";
        employee.last_name="name";
        employee.title="title";
    }
}

package org.javaFaker.test;

import com.github.javafaker.Faker;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmployeeRegistrationTest {

    Faker fakerData = new Faker();
    Employee employee;

    @BeforeMethod
    public void generateData() {
        employee = new Employee();
        employee.setFirstName(fakerData.name().firstName());
        employee.setLastName(fakerData.name().lastName());
        employee.setInterest(fakerData.internet().domainWord());
        employee.setPhoneNumber(fakerData.phoneNumber().phoneNumber());
        employee.setAddress(fakerData.address().fullAddress());
        employee.setEmail(fakerData.internet().emailAddress());
        employee.setDesignation(fakerData.job().position());
    }

    @Test
    public void registerEmployee() {
        System.out.println(employee.getFirstName());
    }

    @Test
    public void registerListOfEmployee() {
        for(int i = 0; i <= 10; i++) {
            generateData();
            System.out.println(employee.getFirstName());
        }
    }
}

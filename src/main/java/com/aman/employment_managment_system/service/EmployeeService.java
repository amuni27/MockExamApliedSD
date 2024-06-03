package com.aman.employment_managment_system.service;

import com.aman.employment_managment_system.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Optional<Employee> addEmployee(Employee employee);

    Optional<Employee> updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    List<Employee> getAllEmployees();
}

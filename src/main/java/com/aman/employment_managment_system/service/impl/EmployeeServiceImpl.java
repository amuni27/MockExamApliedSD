package com.aman.employment_managment_system.service.impl;

import com.aman.employment_managment_system.entity.Employee;
import com.aman.employment_managment_system.repository.EmployeeRepository;
import com.aman.employment_managment_system.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> addEmployee(Employee employee) {
        return Optional.of(employeeRepository.save(employee));
    }

    @Override
    public Optional<Employee> updateEmployee(Employee employee) {
        Optional<Employee> employee1 = employeeRepository.findById(employee.getId());
        if(employee1.isPresent()){
            employee1.get().setFirstname(employee.getFirstname());
            employee1.get().setLastname(employee.getLastname());
            employee1.get().setSalery(employee.getSalery());
        }
        return Optional.of(employeeRepository.save(employee1.get()));
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}

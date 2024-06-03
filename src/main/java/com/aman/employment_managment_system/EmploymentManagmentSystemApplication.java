package com.aman.employment_managment_system;

import com.aman.employment_managment_system.entity.Employee;
import com.aman.employment_managment_system.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class EmploymentManagmentSystemApplication implements CommandLineRunner {
    private final EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(EmploymentManagmentSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee("Amanuel", "Lawro", 12000);
        Employee employee1 = new Employee("Mengesha", "dasd", 14000);
        Employee employee2 = new Employee("Teddy", "cxds", 9000);
        Employee employee3 = new Employee("Biniyam", "ewr", 16000);
        Employee employee4 = new Employee("Yohannes", "Lawro", 20000);
        employeeService.addEmployee(employee);
        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);
        employeeService.addEmployee(employee3);
        employeeService.addEmployee(employee4);
//        List<Employee> employees = employeeService.getAllEmployees();
//        employees.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if(o1.getSalery()>o2.getSalery()){
//                    return 1;
//                }else if(o1.getSalery()== o2.getSalery()){
//                    int firstnameComparison = o2.getLastname().compareTo(o1.getLastname());
//                    if (firstnameComparison != 0) {
//                        return firstnameComparison;
//                    } else {
//                        return 0;
//                    }
//                }else {
//                    return -1;
//                }
//
//            }
//        });
//        for (Employee employe : employees) {
//            System.out.println(employe.toString());
//        }
        employeeService.getAllEmployees()
                .stream()
                .sorted(
                        Comparator.comparing(Employee::getSalery)
                                .thenComparing(Employee::getLastname, Comparator.reverseOrder())
                )
                .forEach(System.out::println);

    }
}

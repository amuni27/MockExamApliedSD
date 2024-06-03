package com.aman.employment_managment_system.repository;

import com.aman.employment_managment_system.entity.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, ObjectId> {

    Optional<Employee> findByFirstnameAndLastname(String firstname, String lastname);
}

package com.aman.employment_managment_system.repository;

import com.aman.employment_managment_system.entity.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, ObjectId> {
}

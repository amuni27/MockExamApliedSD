package com.aman.employment_managment_system.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "employee")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    @Id
    private ObjectId id;
    @Field(name = "firstname")
    private String firstname;
    @Field(name = "lastname")
    private String lastname;
    @Field(name = "salary")
    private double salery;

    public Employee(String firstname, String lastname, double salery) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salery = salery;
    }


}

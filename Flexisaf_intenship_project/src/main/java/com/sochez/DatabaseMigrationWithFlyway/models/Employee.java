package com.sochez.DatabaseMigrationWithFlyway.models;

import jakarta.persistence.Entity;

@Entity
public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String sex;
    private String email;
    private Integer phoneNumber;
    private String nextOfKinFirstName;
    private String nextOfKinLastName;
    private String nextOfKinEmail;
    private Integer nextOfKinPhoneNumber;
}

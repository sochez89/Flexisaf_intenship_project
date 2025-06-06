package com.solomon.databaseWith_Hibernate.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

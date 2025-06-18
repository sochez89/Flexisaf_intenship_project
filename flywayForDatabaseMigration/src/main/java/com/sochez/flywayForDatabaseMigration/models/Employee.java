package com.sochez.flywayForDatabaseMigration.models;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String sex;
    private String NOKFirstName;
    private String NOKLastName;
    private String NOKEmail;
    private String NOKPhoneNumber;
}

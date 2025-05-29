package com.Framework_architecture.framework_architecture.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    @OneToMany(mappedBy = "project")
    private Set<Assignment> assignment = new HashSet<>();

    public enum ProjectStatus {
        PLANNING, ONGOING, COMPLETED, ON_HOLD
    }
}

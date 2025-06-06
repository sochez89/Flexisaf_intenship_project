package com.Framework_architecture.framework_architecture.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "intern")
public class Intern {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private LocalDate joinDate;

    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private Mentor mentor;

    @OneToMany(mappedBy = "intern")
    private Set<Assignment> assignment = new HashSet<>();

    public Intern() {
    }

    public Intern(Long id, String name, String email, LocalDate joinDate, Mentor mentor) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.joinDate = joinDate;
        this.mentor = mentor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Set<Assignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(Set<Assignment> assignment) {
        this.assignment = assignment;
    }
}

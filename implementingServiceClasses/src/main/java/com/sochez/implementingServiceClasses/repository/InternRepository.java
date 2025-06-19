package com.sochez.implementingServiceClasses.repository;

import com.sochez.implementingServiceClasses.models.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InternRepository extends JpaRepository<Intern, Integer> {
}

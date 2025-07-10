package com.sochez.RESTful_API_best_practices.repository;

import com.sochez.RESTful_API_best_practices.models.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InternRepository extends JpaRepository<Intern, Integer> {

    Optional<Intern> findByEmail(String email);
}

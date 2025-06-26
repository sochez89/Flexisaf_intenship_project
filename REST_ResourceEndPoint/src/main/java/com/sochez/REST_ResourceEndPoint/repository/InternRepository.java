package com.sochez.REST_ResourceEndPoint.repository;

import com.sochez.REST_ResourceEndPoint.models.Intern;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternRepository extends JpaRepository<Intern, Integer> {
}

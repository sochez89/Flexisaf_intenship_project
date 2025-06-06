package com.Framework_architecture.framework_architecture.repository;

import com.Framework_architecture.framework_architecture.models.Intern;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternRepository extends JpaRepository<Intern, Integer> {
}

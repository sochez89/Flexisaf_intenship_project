package com.Framework_architecture.framework_architecture.repository;

import com.Framework_architecture.framework_architecture.models.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, Integer> {
}

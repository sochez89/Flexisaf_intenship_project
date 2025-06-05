package com.Framework_architecture.framework_architecture.repository;

import com.Framework_architecture.framework_architecture.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}

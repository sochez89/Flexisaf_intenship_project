package com.sochez.RESTful_API_best_practices.service;

import com.sochez.RESTful_API_best_practices.models.Intern;
import com.sochez.RESTful_API_best_practices.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InternService {
    @Autowired
    private InternRepository internRepository;
    public Intern saveIntern(Intern intern) {
        return internRepository.save(intern);
    }
}

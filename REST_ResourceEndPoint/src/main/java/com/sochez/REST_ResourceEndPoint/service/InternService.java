package com.sochez.REST_ResourceEndPoint.service;

import com.sochez.REST_ResourceEndPoint.models.Intern;
import com.sochez.REST_ResourceEndPoint.repository.InternRepository;
import org.springframework.stereotype.Service;

@Service
public class InternService {
    private InternRepository internRepository;
    public Intern saveIntern(Intern intern) {
        return internRepository.save(intern);
    }
}

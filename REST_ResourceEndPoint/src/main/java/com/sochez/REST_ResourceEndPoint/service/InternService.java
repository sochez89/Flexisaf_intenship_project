package com.sochez.REST_ResourceEndPoint.service;

import com.sochez.REST_ResourceEndPoint.models.Intern;
import com.sochez.REST_ResourceEndPoint.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;
    public Intern saveIntern(Intern intern) {
        return internRepository.save(intern);
    }

    public List<Intern> getAll() {
        return internRepository.findAll();
    }
}

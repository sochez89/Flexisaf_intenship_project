package com.sochez.REST_ResourceEndPoint.service;

import com.sochez.REST_ResourceEndPoint.models.Intern;
import com.sochez.REST_ResourceEndPoint.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Intern> getInternById(Integer id) {
        return internRepository.findById(id);
    }

    public void deleteInternById(Integer id) {
        internRepository.deleteById(id);
    }
}

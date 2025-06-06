package com.Framework_architecture.framework_architecture.service;

import com.Framework_architecture.framework_architecture.models.Intern;
import com.Framework_architecture.framework_architecture.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternService {
    @Autowired
    private InternRepository internRepository;

    public List<Intern> findAllIntern() {
        return internRepository.findAll();
    }

    public Optional<Intern> findInternById(Integer id) {
        return internRepository.findById(id);
    }
}

package com.sochez.implementingServiceClasses.service;

import com.sochez.implementingServiceClasses.models.Intern;
import com.sochez.implementingServiceClasses.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;
    public List<Intern> getFindAllIntern() {
        return internRepository.findAll();
    }
}

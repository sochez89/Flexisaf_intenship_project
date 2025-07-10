package com.sochez.RESTful_API_best_practices.service;

import com.sochez.RESTful_API_best_practices.exceptions.DuplicateUserException;
import com.sochez.RESTful_API_best_practices.exceptions.EmptyFieldException;
import com.sochez.RESTful_API_best_practices.models.Intern;
import com.sochez.RESTful_API_best_practices.repository.InternRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternService {

    private static final Logger logger = LoggerFactory.getLogger(InternService.class);
    @Autowired
    private InternRepository internRepository;
    private Intern internDetails;

    @Transactional
    public Intern saveIntern(Intern intern) {
        if (intern == null || intern.getEmail() == null || intern.getEmail().trim().isEmpty() ||
                intern.getFirstName() == null || intern.getFirstName().trim().isEmpty() ||
                intern.getLastName() == null || intern.getLastName().trim().isEmpty()){
            throw new EmptyFieldException("Fields must not be null");
        }
        Optional<Intern> existingByEmail = internRepository.findByEmail(intern.getEmail());
        if (existingByEmail.isPresent()){
            throw new DuplicateUserException("Intern with email " + intern.getEmail() + " already exist");
        }
        Intern savedIntern = internRepository.save(intern);
        logger.info("Intern saved successfully");
        return savedIntern;
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

    public Intern updateIntern(Integer id, Intern intern) {
        Optional<Intern> optionalIntern = internRepository.findById(id);

        if (optionalIntern.isPresent()){
            Intern existingIntern = optionalIntern.get();

            if (internDetails.getFirstName() != null){
                existingIntern.setFirstName(internDetails.getFirstName());
            }
            if (internDetails.getLastName() != null){
                existingIntern.setLastName(internDetails.getFirstName());
            }
            if(internDetails.getEmail() != null){
                existingIntern.setEmail(internDetails.getEmail());
            }
            if (internDetails.getPhoneNumber() != null){
                existingIntern.setPhoneNumber(internDetails.getPhoneNumber());
            }
            return internRepository.save(existingIntern);
        }else{
            throw new RuntimeException("Intern with id: " + id + " not found.");
        }
    }
}

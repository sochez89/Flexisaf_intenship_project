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

    public Intern updateIntern(Integer id, Intern internDetails) {
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

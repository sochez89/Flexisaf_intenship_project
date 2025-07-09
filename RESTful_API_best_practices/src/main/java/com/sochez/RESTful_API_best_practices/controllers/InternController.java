package com.sochez.RESTful_API_best_practices.controllers;

import com.sochez.RESTful_API_best_practices.models.Intern;
import com.sochez.RESTful_API_best_practices.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/interns")
public class InternController {

    @Autowired
    private InternService internService;
    @PostMapping("/add")
    public ResponseEntity<Intern> addIntern(@RequestBody Intern intern){
        System.out.println("Data received " + intern);
        Intern savedIntern = internService.saveIntern(intern);
        System.out.println("This intern data was successfully saved: "+  savedIntern);
        return ResponseEntity.ok(savedIntern);
    }
}

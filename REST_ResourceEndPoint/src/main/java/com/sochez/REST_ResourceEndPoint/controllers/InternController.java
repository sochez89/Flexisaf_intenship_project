package com.sochez.REST_ResourceEndPoint.controllers;

import com.sochez.REST_ResourceEndPoint.models.Intern;
import com.sochez.REST_ResourceEndPoint.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/interns")
public class InternController {

    @Autowired
    private Intern intern;
    private InternService internService;

    @PostMapping("/add")
    public ResponseEntity<Intern> addIntern(@RequestBody Intern intern){
        System.out.println("Data received " + intern);
        Intern savedInter = internService.saveIntern(intern);
        return ResponseEntity.ok(savedInter);
    }
}

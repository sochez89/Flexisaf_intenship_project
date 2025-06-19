package com.sochez.implementingServiceClasses.controller;

import com.sochez.implementingServiceClasses.models.Intern;
import com.sochez.implementingServiceClasses.service.InternService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/interns/")
public class InternController {
    @Autowired
    private InternService internService;

    @GetMapping("/all")
    public ResponseEntity<List<Intern>> getAllIntern(){
        List<Intern> retrievedIntern =internService.getFindAllIntern();
        System.out.println("Retrieved interns are: " + retrievedIntern);
        return ResponseEntity.ok(retrievedIntern);
    }
}

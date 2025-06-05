package com.Framework_architecture.framework_architecture.controller;

import com.Framework_architecture.framework_architecture.models.Mentor;
import com.Framework_architecture.framework_architecture.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/mentor")
public class MentorController {
    @Autowired
    private MentorService mentorservice;

    @PostMapping("/add")
    public ResponseEntity<Mentor> addMentor(@RequestBody Mentor mentor){
        System.out.println("Data received " + mentor);
        if (mentor==null){
            return ResponseEntity.badRequest().body(null);
        }
        Mentor savementor = mentorservice.saveMentor(mentor);
        System.out.println("data of mentor saved is as follows: " + savementor);
        return ResponseEntity.ok(savementor);
    }
}

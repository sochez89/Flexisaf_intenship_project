package com.Framework_architecture.framework_architecture.controller;

import com.Framework_architecture.framework_architecture.models.Intern;
import com.Framework_architecture.framework_architecture.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/intern/")
public class InternController {
    @Autowired
    private InternService internService;
    @GetMapping("/all")
    public ResponseEntity<List<Intern>> getAllIntern(){
        List<Intern> retrievedIntern = internService.findAllIntern();
        System.out.println("Retrieved intern are: "+ retrievedIntern);

        return ResponseEntity.ok(retrievedIntern);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getInternById(@PathVariable Integer id){

        Optional<Intern> retrievedIntern = internService.findInternById(id);
        System.out.println("Retrieved Intern id: "+ retrievedIntern);

        if (retrievedIntern.isPresent()){
            return ResponseEntity.ok(retrievedIntern);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}

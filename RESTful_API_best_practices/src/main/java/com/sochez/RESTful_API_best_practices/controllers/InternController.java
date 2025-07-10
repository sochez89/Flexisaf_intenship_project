package com.sochez.RESTful_API_best_practices.controllers;

import com.sochez.RESTful_API_best_practices.exceptions.UserNotFoundException;
import com.sochez.RESTful_API_best_practices.models.Intern;
import com.sochez.RESTful_API_best_practices.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
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

    @GetMapping("/all")
    public ResponseEntity<List<Intern>> getAll(){
        List<Intern> registeredIntern = internService.getAll();
        System.out.println("List of registered interns are: "+ registeredIntern);
        return ResponseEntity.ok(registeredIntern);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Intern>> getInternById(@PathVariable Integer id){
        Optional<Intern> retrievedInter = Optional.ofNullable(internService.getInternById(id)
                .orElseThrow(() -> new UserNotFoundException(id)));
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteInternById(@PathVariable Integer id){
        internService.deleteInternById(id);
        return ResponseEntity.ok("The intern with id: " + id + " was successfully deleted");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Intern> updateIntern(@PathVariable Integer id, @RequestBody Intern intern){
        try{
            Intern updatedIntern = internService.updateIntern(id, intern);
            System.out.println("The updated details are as follows: "+ updatedIntern);
            return ResponseEntity.ok(updatedIntern);
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }
}

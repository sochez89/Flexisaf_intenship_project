package com.Framework_architecture.framework_architecture.controller;

import com.Framework_architecture.framework_architecture.models.Project;
import com.Framework_architecture.framework_architecture.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("/add")
    public ResponseEntity<Project> addProject(@RequestBody Project project){
        System.out.println("project object received: "+ project);

        //validate that the data received is not null
        if(project ==null){
            return ResponseEntity.badRequest().body(null);
        }
        Project savedproject = projectService.saveProject(project);
        System.out.println("saved project to the database: "
                + savedproject);
        return ResponseEntity.ok(savedproject);
    }

    @GetMapping("/allProjects")
    public ResponseEntity<List<Project>> getAllProjects(){
        List<Project> project = projectService.getAllProjects();
        return ResponseEntity.ok(project);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Project>> getById(@PathVariable Integer id){
        Optional<Project> project = projectService.findById(id);
        System.out.println("project retrieved is: " + project);

        if (project.isPresent()){
            return ResponseEntity.ok(project);
        } else{
            return ResponseEntity.notFound().build();
        }
    }
}

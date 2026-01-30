package com.gentech.project.controller;

import com.gentech.project.dto.ProjectDto;
import com.gentech.project.entity.Project;
import com.gentech.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @PostMapping("/projects")
    public ResponseEntity<ProjectDto> saveProject(@RequestBody Project project)
    {
        return new ResponseEntity<>(service.createProject(project), HttpStatus.CREATED);
    }

    @GetMapping("/projects")
    public ResponseEntity<List<ProjectDto>> displayAllProjects(){
        return new ResponseEntity<>(service.getAllProjects(),HttpStatus.OK);
    }

    @GetMapping("/projects/{id}")
    public ResponseEntity<ProjectDto> getSpecificProject(@PathVariable Integer id)
    {
        return new ResponseEntity<>(service.getProjectById(id), HttpStatus.OK);
    }

    @PutMapping("/projects/{id}")
    public ResponseEntity<ProjectDto> modifyProject(@PathVariable Integer id,
                                                    @RequestBody Project project)
    {
        return new ResponseEntity<>(service.updateProject(id, project), HttpStatus.OK);
    }

    @DeleteMapping("/projects/{id}")
    public ResponseEntity<String> deleteProject(@PathVariable Integer id)
    {
        service.deleteProjectById(id);
        return new ResponseEntity<>("The Project with id "+id+" has deleted successfully", HttpStatus.OK);
    }
}

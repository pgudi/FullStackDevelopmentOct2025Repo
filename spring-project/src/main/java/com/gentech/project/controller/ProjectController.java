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
@CrossOrigin("*")
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
    // http://localhost:8083/api/v1/projects/filterbytitle?title=Omega
    @GetMapping("/projects/filterbytitle")
    public ResponseEntity<List<ProjectDto>> getAllProjectsByTitle(@RequestParam("title") String title)
    {
        return new ResponseEntity<>(service.getProjectsByProjectTitle(title), HttpStatus.OK);
    }

    @GetMapping("/projects/validateproject")
    public ResponseEntity<Boolean> isProjectTitleExists(@RequestParam("title") String title){
        return new ResponseEntity<>(service.existProjectsByProjectTitle(title), HttpStatus.OK);
    }

    @GetMapping("/projects/projecttitle")
    public ResponseEntity<List<ProjectDto>> getProjectsUsingTitle(@RequestParam("title") String title)
    {
        return  new ResponseEntity<>(service.getProjectsByUsingProjectTitle(title), HttpStatus.OK);
    }

    @PostMapping("/projects/updatebytitle")
    public ResponseEntity<String> updateByTitle(@RequestParam("domain") String domain,
                                                @RequestParam("title") String title)
    {
        Integer count=service.updateProjectsByProjectTitle(domain,title);
        return new ResponseEntity<>("It has updated "+count+" of records in the table", HttpStatus.OK);
    }

    @DeleteMapping("/projects/deletebydesc")
    public ResponseEntity<String> deleteByDescription(@RequestParam("desc") String desc){
        Integer count=service.deleteProjectsByDescription(desc);
        return new ResponseEntity<>("It has deleted "+count+" from Database table", HttpStatus.OK);
    }

    @GetMapping("/projects/domaincontaining")
    public ResponseEntity<List<ProjectDto>>
    displayProjectBasedOnLike(@RequestParam("domain") String domain,
                              @RequestParam("column") String column){
        return new ResponseEntity<>
                (service.getProjectsByProjectDomainContaining(domain,column),
                        HttpStatus.OK);
    }

    @GetMapping("/projects/pagination")
    public ResponseEntity<List<ProjectDto>>
    getProjectsByPagination(@RequestParam("pageNumber") Integer pageNumber,
                            @RequestParam("pageSize") Integer pageSize)
    {
        return new ResponseEntity<>(service.getAllProjects
                (pageNumber, pageSize), HttpStatus.OK);
    }
}

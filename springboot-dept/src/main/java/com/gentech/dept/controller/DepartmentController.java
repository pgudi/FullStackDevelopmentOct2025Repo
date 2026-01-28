package com.gentech.dept.controller;

import com.gentech.dept.entity.Department;
import com.gentech.dept.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/departments")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department)
    {
        return new ResponseEntity<>(service.createDepartment(department), HttpStatus.CREATED);
    }

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> getDepartments()
    {
        return new ResponseEntity<>(service.getAllDepartment(), HttpStatus.OK);
    }

    @GetMapping("/departments/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Integer id)
    {
        return new ResponseEntity<>(service.getDepartmentById(id), HttpStatus.OK);
    }


    @PutMapping("/departments/{id}")
    public ResponseEntity<Department> editDepartment(@PathVariable Integer id,
                                                     @RequestBody Department department)
    {
        return new ResponseEntity<>(service.updateDepartment(id,department), HttpStatus.OK);
    }

    @DeleteMapping("/departments/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable Integer id)
    {
        service.deleteDepartmentById(id);
        return  new ResponseEntity<>("The Department with id "+id+" has deleted successfully", HttpStatus.OK);
    }
}

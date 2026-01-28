package com.gentech.dept.serviceimpl;

import com.gentech.dept.entity.Department;
import com.gentech.dept.exception.ResourceNotFoundException;
import com.gentech.dept.repository.DepartmentRepository;
import com.gentech.dept.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository repository;
    public DepartmentServiceImpl(DepartmentRepository repository){
        this.repository=repository;
    }
    @Override
    public Department createDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return repository.findAll();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        Department existingDept=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Department id "+id+" has not Found"));
        return existingDept;
    }

    @Override
    public Department updateDepartment(Integer id, Department department) {
        Department existingDept=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Department id "+id+" has not Found"));

        existingDept.setId(id);
        existingDept.setDeptName(department.getDeptName());
        existingDept.setLocation(department.getLocation());
        return repository.save(existingDept);
    }

    @Override
    public void deleteDepartmentById(Integer id) {
        Department existingDept=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Department id "+id+" has not Found"));

        repository.delete(existingDept);
    }
}

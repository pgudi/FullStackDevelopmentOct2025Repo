package com.gentech.project.serviceimpl;

import com.gentech.project.dto.ProjectDto;
import com.gentech.project.entity.Project;
import com.gentech.project.exception.ResourceNotFoundException;
import com.gentech.project.mapping.ProjectMapping;
import com.gentech.project.repository.ProjectRepository;
import com.gentech.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository repository;
    @Override
    public ProjectDto createProject(Project project) {
        Project savedProject=repository.save(project);
        return ProjectMapping.mapToProjectDto(savedProject);
    }

    @Override
    public List<ProjectDto> getAllProjects() {
        return repository.findAll().stream().map((project -> ProjectMapping.mapToProjectDto(project)))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProjectDto> getAllProjects
            (Integer PageNumber, Integer pageSize) {
        Pageable pages=PageRequest.of
                (PageNumber,pageSize, Sort.Direction.ASC,"id");
        return repository.findAll(pages)
                .stream().map((project ->
                        ProjectMapping.mapToProjectDto(project)))
                .collect(Collectors.toList());
    }

    @Override
    public ProjectDto getProjectById(Integer id) {
        Project existingProject=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Project with id "+id+" has not Found !!"));

        return ProjectMapping.mapToProjectDto(existingProject);
    }

    @Override
    public ProjectDto updateProject(Integer id, Project project) {
        Project existingProject=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Project with id "+id+" has not Found !!"));

        existingProject.setId(id);
        existingProject.setProjectTitle(project.getProjectTitle());
        existingProject.setProjectDomain(project.getProjectDomain());
        existingProject.setProjectDescription(project.getProjectDescription());

        Project savedProject=repository.save(existingProject);

        return ProjectMapping.mapToProjectDto(savedProject);
    }

    @Override
    public void deleteProjectById(Integer id) {
        Project existingProject=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Project with id "+id+" has not Found !!"));

        repository.delete(existingProject);
    }

    @Override
    public List<ProjectDto> getProjectsByProjectTitle(String projectTitle) {
        return repository.findByProjectTitle(projectTitle).stream().map((project -> ProjectMapping.mapToProjectDto(project)))
                .collect(Collectors.toList());
    }

    @Override
    public boolean existProjectsByProjectTitle(String projectTitle) {
        if (repository.existsByProjectTitle(projectTitle)==true){
           return  true;
        }else{
            return  false;
        }
    }

    @Override
    public List<ProjectDto> getProjectsByUsingProjectTitle(String projectTitle) {
        return repository.getProjectsByUsingProjectTitle(projectTitle).stream().map((project -> ProjectMapping.mapToProjectDto(project)))
                .collect(Collectors.toList());
    }

    @Override
    public Integer updateProjectsByProjectTitle(String domain,String projectTitle) {
        return repository.updateProjectsByProjectTitle(domain,projectTitle);
    }

    @Override
    public Integer deleteProjectsByDescription(String description) {
        return repository.deleteProjectsByDescription(description);
    }

    @Override
    public List<ProjectDto> getProjectsByProjectDomainContaining
            (String projectDomain, String columnName) {
        Sort sort = Sort.by(Sort.Direction.ASC, columnName);
        return repository.
                findByProjectDomainContaining(projectDomain,sort)
                .stream().map((project ->
                        ProjectMapping.mapToProjectDto(project)))
                .collect(Collectors.toList());
    }


}

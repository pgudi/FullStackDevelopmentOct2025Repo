package com.gentech.project.serviceimpl;

import com.gentech.project.dto.ProjectDto;
import com.gentech.project.entity.Project;
import com.gentech.project.exception.ResourceNotFoundException;
import com.gentech.project.mapping.ProjectMapping;
import com.gentech.project.repository.ProjectRepository;
import com.gentech.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
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
}

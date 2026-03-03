package com.gentech.project.service;

import com.gentech.project.dto.ProjectDto;
import com.gentech.project.entity.Project;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectService {

    ProjectDto createProject(Project project);

    List<ProjectDto> getAllProjects();

    List<ProjectDto> getAllProjects(Integer PageNumber, Integer pageSize);

    ProjectDto getProjectById(Integer id);

    ProjectDto updateProject(Integer id, Project project);

    void deleteProjectById(Integer id);

    List<ProjectDto> getProjectsByProjectTitle(String projectTitle);

    boolean existProjectsByProjectTitle(String projectTitle);

    List<ProjectDto> getProjectsByUsingProjectTitle(String projectTitle);

    Integer updateProjectsByProjectTitle(String domain,String projectTitle);

    Integer deleteProjectsByDescription(String description);

    List<ProjectDto> getProjectsByProjectDomainContaining(String projectDomain, String columnName);
}


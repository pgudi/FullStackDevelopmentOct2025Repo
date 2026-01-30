package com.gentech.project.service;

import com.gentech.project.dto.ProjectDto;
import com.gentech.project.entity.Project;

import java.util.List;

public interface ProjectService {

    ProjectDto createProject(Project project);

    List<ProjectDto> getAllProjects();

    ProjectDto getProjectById(Integer id);

    ProjectDto updateProject(Integer id, Project project);

    void deleteProjectById(Integer id);
}

package com.gentech.project.mapping;

import com.gentech.project.dto.ProjectDto;
import com.gentech.project.entity.Project;

public class ProjectMapping {

    public static ProjectDto mapToProjectDto(Project project)
    {
       return new ProjectDto(project.getId(),
                project.getProjectTitle(),
                project.getProjectDomain(),
                project.getProjectDescription(),
                project.getCreatedAt(),
                project.getUpdatedAt());
    }

    public static Project mapToProject(ProjectDto projectDto)
    {
        return new Project(
                projectDto.getId(),
                projectDto.getProjectTitle(),
                projectDto.getProjectDomain(),
                projectDto.getProjectDescription(),
                projectDto.getCreatedAt(),
                projectDto.getUpdatedAt()
        );
    }
}

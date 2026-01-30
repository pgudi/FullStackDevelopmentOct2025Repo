package com.gentech.project.dto;

import java.util.Date;

public class ProjectDto {
    private Integer id;
    private String projectTitle;
    private String projectDomain;
    private String projectDescription;
    private Date createdAt;
    private Date updatedAt;

    public ProjectDto(){

    }
    public ProjectDto(Integer id, String projectTitle, String projectDomain, String projectDescription, Date createdAt, Date updatedAt) {
        this.id = id;
        this.projectTitle = projectTitle;
        this.projectDomain = projectDomain;
        this.projectDescription = projectDescription;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDomain() {
        return projectDomain;
    }

    public void setProjectDomain(String projectDomain) {
        this.projectDomain = projectDomain;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

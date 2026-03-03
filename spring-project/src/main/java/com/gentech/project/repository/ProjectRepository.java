package com.gentech.project.repository;

import com.gentech.project.dto.ProjectDto;
import com.gentech.project.entity.Project;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    List<Project> findByProjectTitle(String projectTitle);

    boolean existsByProjectTitle(String projectTitle);

    @Transactional
    @Modifying
    @Query(value = "FROM Project p WHERE p.projectTitle=:projectTitle")
    List<Project> getProjectsByUsingProjectTitle(@Param("projectTitle") String projectTitle);

    @Transactional
    @Modifying
    @Query(value = "UPDATE Project p SET p.projectDomain=:domain where p.projectTitle=:title")
    Integer updateProjectsByProjectTitle(@Param("domain") String domain, @Param("title") String title);


    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Project p Where p.projectDescription=:description")
    Integer deleteProjectsByDescription(@Param("description") String description);


    List<Project> findByProjectDomainContaining(String projectDomain, Sort sort);
}

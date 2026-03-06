package com.gentech.relationship.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_tourists")
public class Tourists {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tourist_id")
    private Integer id;
    @Column(name = "tourist_name")
    private String touristName;
    @Column(name = "tourist_email")
    private String emailId;
    @Column(name = "tourist_country_name")
    private String countryName;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tourists_places",
            joinColumns = {@JoinColumn(name = "tourist_tourist_id")},
            inverseJoinColumns = {@JoinColumn(name = "place_place_id")}
    )
    Set<Places> places=new HashSet<>();

    public Tourists(){

    }
    public Tourists(Integer id, String touristName, String emailId, String countryName, Date createdAt, Date updatedAt, Set<Places> places) {
        this.id = id;
        this.touristName = touristName;
        this.emailId = emailId;
        this.countryName = countryName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.places = places;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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

    public Set<Places> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Places> places) {
        this.places = places;
    }
}

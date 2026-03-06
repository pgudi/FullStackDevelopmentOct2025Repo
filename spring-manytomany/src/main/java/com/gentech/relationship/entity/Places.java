package com.gentech.relationship.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "tbl_places")
public class Places {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private Integer id;
    @Column(name = "place_name")
    private String placeName;
    @Column(name = "place_type")
    private String placeType;
    @Column(name = "place_state_name")
    private String stateName;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "places")
    Set<Tourists> tourists=new HashSet<>();

    public Places(){

    }
    public Places(Integer id, String placeName, String placeType, String stateName, Date createdAt, Date updatedAt, Set<Tourists> tourists) {
        this.id = id;
        this.placeName = placeName;
        this.placeType = placeType;
        this.stateName = stateName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.tourists = tourists;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
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

    public Set<Tourists> getTourists() {
        return tourists;
    }

    public void setTourists(Set<Tourists> tourists) {
        this.tourists = tourists;
    }
}

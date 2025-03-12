package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// The Asset class is an entity model that maps to the 'asset' table in the database.
@Entity
public class Asset {

    // The 'id' field is the primary key for the 'asset' table.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // The 'name' field represents the name of the asset.
    private String name;

    // The 'class' field represents the class of the asset.
    // It's mapped to the 'class' column in the 'asset' table.
    @Column(name = "class")
    private String className;

    // The 'location' field represents the location of the asset.
    private String location;

    // The 'description' field represents the description of the asset.
    private String description;

    // Getter and setter for 'id'.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and setter for 'name'.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for 'className'.
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // Getter and setter for 'location'.
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Getter and setter for 'description'.
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
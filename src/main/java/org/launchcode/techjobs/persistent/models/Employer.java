package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity
public class Employer extends AbstractEntity {

    @Size(min = 5, max = 20, message = "Location must be between 5  and 20 characters long")
    @NotNull(message = "Location is required")
    @NotBlank(message = "Location is required")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer(){};

    @OneToMany
    @JoinColumn
    private ArrayList<Job> jobs;

}

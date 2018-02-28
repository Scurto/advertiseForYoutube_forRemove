package com.advertise.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "advertise")
public class Advertise {

    @Id
    @Column(name = "id")
    private String id;
    private String mainUrl;
    private String location;
    private String type;

    @Column(name="secondaryUrls")
    @ElementCollection(targetClass=String.class)
    private List<String> secondaryUrls;

    public Advertise() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainUrl() {
        return mainUrl;
    }

    public void setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getSecondaryUrls() {
        return secondaryUrls;
    }

    public void setSecondaryUrls(List<String> secondaryUrls) {
        this.secondaryUrls = secondaryUrls;
    }
}

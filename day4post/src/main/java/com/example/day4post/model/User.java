package com.example.day4post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Appliances")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullname;
    private String email;
    private String password;
    private String appliancename;
    private String appliancebrand;
    private int serviceno;
    public User() {
    }
    public User(int id, String fullname, String email, String password, String appliancename, String appliancebrand,
            int serviceno) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.appliancename = appliancename;
        this.appliancebrand = appliancebrand;
        this.serviceno = serviceno;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAppliancename() {
        return appliancename;
    }
    public void setAppliancename(String appliancename) {
        this.appliancename = appliancename;
    }
    public String getAppliancebrand() {
        return appliancebrand;
    }
    public void setAppliancebrand(String appliancebrand) {
        this.appliancebrand = appliancebrand;
    }
    public int getServiceno() {
        return serviceno;
    }
    public void setServiceno(int serviceno) {
        this.serviceno = serviceno;
    }
    
}
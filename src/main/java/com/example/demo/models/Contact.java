package com.example.demo.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = " contacts")

public class Contact {
    @Embedded
    private Name name;

    private String title;
    private String company;

    public Contact() {
    }

    public Contact(Name name, String title, String company) {
        this.name = name;
        this.title = title;
        this.company = company;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

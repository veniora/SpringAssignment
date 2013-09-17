package com.springapp.mvc.model;

import javax.persistence.*;

/**
 * A very basic user which will be used to store libraries and books against
 */
@Entity
@Table(name = "USERS")
public class BasicUser {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int userId;

    @Column(name = "NAME")
    String name;

    public BasicUser() {
    }

    public BasicUser(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

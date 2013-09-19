package com.springapp.mvc.model;

import javax.persistence.*;
import java.util.Set;

/**
 * A very basic user which will be used to store libraries and books against
 */
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "NAME")
    String name;

    @OneToMany(mappedBy="user")
    private Set<Book> books;

    public User() {
    }

    public Set<Book> getBooks() {
        return books;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

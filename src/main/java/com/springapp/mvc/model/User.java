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
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;

    @Column(name = "name")
    String name;

    @OneToMany
    @JoinColumn(name="user_id")
    private Set<Book> books;

    public User() {
    }

    public User(int user_id, String name) {
        this.user_id = user_id;
        this.name = name;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}

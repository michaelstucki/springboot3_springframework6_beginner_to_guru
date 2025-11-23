package com.michaelstucki.spring6webapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Tell JPA provider (e.g., Hibernate) that this class represents
 * a persistent entity whose instances can be stored/retrieved from
 * a relational database
 */
@Entity
public class Book {

    // Tell JPA that id is the primary key in the database that the DBMS will
    // auto-increment
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String isbn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

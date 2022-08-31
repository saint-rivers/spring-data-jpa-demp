package com.ksga.jpademo.model.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sal
 *
 * Create a table named "authors"
 * fields:  id (auto-increment)
 *          name
 *          gender
 *          email
 */


@Entity(name = "Author")
@Table(name="authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Integer id;

    @Column(nullable = false)
    private String name ;

    @Column(unique = true , nullable = false)
    private String email;

    @OneToMany(mappedBy = "author")
    private List<Book> books = new ArrayList<>();
}

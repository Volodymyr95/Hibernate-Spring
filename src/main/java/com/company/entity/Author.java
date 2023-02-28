package com.company.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
        name = "author_book",
        joinColumns = {@JoinColumn(name = "author_id")},
        inverseJoinColumns = {@JoinColumn(name = "book_id")}
    )
    private List<Book> books;

}

package com.medium.libraryinfosystem.model.lombok;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ragcrix
 */

@Data
@Entity
@Table
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String writer;
    private String name;
    private String genre;
    private String year;
}

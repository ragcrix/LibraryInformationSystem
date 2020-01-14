package com.medium.libraryinfosystem.dto;

import lombok.Data;

/**
 * @author ragcrix
 */
@Data
public class BookDTO {
    private Long id;
    private String writer;
    private String name;
    private String genre;
    private String year;
}

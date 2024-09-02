package com.edgv.library_api_sec.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank
    @NotNull
    private String title;
    @Column
    private String author;
    @Column
    private String category;
    @Column(name = "page_count")
    @Positive
    private int page_count;
    @Column
    private double latitude;
    @Column
    private double longitude;



}

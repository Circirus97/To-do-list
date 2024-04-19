package com.riwi.To_do_list.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity

@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDate creationDate;

    @Column(nullable = false)
    private LocalTime creationTime;

    @Column(length = 50, nullable = false)
    private String status;

}

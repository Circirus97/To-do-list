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

    public Task() { }

    public Task(Long id, String title, LocalDate creationDate, LocalTime creationTime, String status) {        this.id = id;
        this.title = title;
        this.creationDate = creationDate;
        this.creationTime = creationTime;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task\n" +
                "id: " + id +
                ", title: " + title +
                ", creation date: " + creationDate +
                ", creation time: " + creationTime +
                ", status: " + status +
               "\n-----------------------------------------------\n";
    }
}

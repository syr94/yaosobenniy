package com.yaosobenniy.site.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String description;

    @Column(name = "assignee_id")
    private Long assigneeId;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(nullable = false)
    private String status;

    // Getters and setters
}
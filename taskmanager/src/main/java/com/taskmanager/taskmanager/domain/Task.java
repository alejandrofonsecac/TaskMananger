package com.taskmanager.taskmanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    String title;
    String description;
    @CreationTimestamp
    private LocalDateTime createdDate;

    @org.hibernate.annotations.UpdateTimestamp
    private LocalDateTime updatedDate;
}

package com.taskmanager.taskmanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    String title;
    String description;
    String createdDate;
}

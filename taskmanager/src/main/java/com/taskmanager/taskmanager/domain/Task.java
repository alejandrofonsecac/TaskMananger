package com.taskmanager.taskmanager.domain;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    Long id;
    String title;
    String description;
    String createdDate;
}

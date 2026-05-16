package com.taskmanager.taskmanager.requested;

import lombok.Data;

@Data
public class TaskPutBodyRequest {
    Long id;
    String title;
    String description;
    String createdDate;
}

package com.taskmanager.taskmanager.requested;

import lombok.Data;

@Data
public class TaskPutBodyRequest {
    public String name;
    public String details;

}

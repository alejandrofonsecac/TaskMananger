package com.taskmanager.taskmanager.requested;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TaskPostBodyRequest {
    @NotEmpty(message = "It cannot be empty.")
    @NotNull(message = "It cannot be null.")
    public String title;
    public String description;
}

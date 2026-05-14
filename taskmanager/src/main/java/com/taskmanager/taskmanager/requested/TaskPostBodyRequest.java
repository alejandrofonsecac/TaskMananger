package com.taskmanager.taskmanager.requested;

import com.taskmanager.taskmanager.domain.StatusTask;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class TaskPostBodyRequest {

    @NotEmpty(message = "It cannot be empty.")
    @NotNull(message = "It cannot be null.")
    public String title;
    public String details;
    public StatusTask statusTask;
}

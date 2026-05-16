package com.taskmanager.taskmanager.mapper;

import com.taskmanager.taskmanager.domain.Task;
import com.taskmanager.taskmanager.requested.TaskPostBodyRequest;
import com.taskmanager.taskmanager.requested.TaskPutBodyRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    Task toTask(TaskPostBodyRequest taskPostBodyRequest);
    Task toTask(TaskPutBodyRequest taskPutBodyRequest);
}
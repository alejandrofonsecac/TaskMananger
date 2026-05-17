package com.taskmanager.taskmanager.mapper;

import com.taskmanager.taskmanager.domain.Task;
import com.taskmanager.taskmanager.requested.TaskPostBodyRequest;
import com.taskmanager.taskmanager.requested.TaskPutBodyRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    @Mapping(target = "createdDate", ignore = true)
    Task toTask(TaskPostBodyRequest taskPostBodyRequest);

    @Mapping(target = "createdDate", ignore = true)
    Task toTask(TaskPutBodyRequest taskPutBodyRequest);
}
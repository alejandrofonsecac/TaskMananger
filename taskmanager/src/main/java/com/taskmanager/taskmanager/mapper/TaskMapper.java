package com.taskmanager.taskmanager.mapper;

import com.taskmanager.taskmanager.domain.Task;
import com.taskmanager.taskmanager.requested.TaskPostBodyRequest;
import com.taskmanager.taskmanager.requested.TaskPutBodyRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class TaskMapper {
    public static final TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);
    public abstract Task toTask(TaskPostBodyRequest taskPostBodyRequest);
    public abstract Task toTask(TaskPutBodyRequest taskPutBodyRequest);
}
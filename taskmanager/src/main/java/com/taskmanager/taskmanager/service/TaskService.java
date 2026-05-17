package com.taskmanager.taskmanager.service;

import academy.devdojo.springboot.exception.BadRequestExeption;
import com.taskmanager.taskmanager.domain.Task;
import com.taskmanager.taskmanager.mapper.TaskMapper;
import com.taskmanager.taskmanager.repository.TaskRepository;
import com.taskmanager.taskmanager.requested.TaskPostBodyRequest;
import com.taskmanager.taskmanager.requested.TaskPutBodyRequest;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Log4j2
@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    @Transactional(rollbackOn = Exception.class)
    public Task createTask(TaskPostBodyRequest request){
        Task task = taskMapper.toTask(request);
        return taskRepository.save(task);
    }

    public void delete(Long id){
        taskRepository.delete(findByIdOrThrowBadRequestExeption(id));
    }

    public void updateTask(TaskPutBodyRequest request){
        Task task = findByIdOrThrowBadRequestExeption(request.getId());
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        taskRepository.save(task);
    }

    public List<Task> listAllTasks(){
        return taskRepository.findAll();
    }

    public Task findByIdOrThrowBadRequestExeption(long id){
        return taskRepository.findById(id)
                .orElseThrow(() -> new BadRequestExeption("Anime not found"));
    }
}

package com.taskmanager.taskmanager.service;

import com.taskmanager.taskmanager.domain.Task;
import com.taskmanager.taskmanager.mapper.TaskMapper;
import com.taskmanager.taskmanager.repository.TaskRepository;
import com.taskmanager.taskmanager.requested.TaskPostBodyRequest;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

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
//
//    public void delete(Long id){
//
//    }
//
//    public void updateTask(Long id){
//
//    }

    public List<Task> listAllTasks(){
        return taskRepository.findAll();
    }
//
//    public Task searchTask(Long id){
//
//    }
}

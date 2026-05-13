package com.taskmanager.taskmanager.service;

import com.taskmanager.taskmanager.domain.StatusTask;
import com.taskmanager.taskmanager.domain.Task;
import com.taskmanager.taskmanager.repository.TaskRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private TaskRepository taskRepository;

    @Transactional(rollbackOn = Exception.class)
    public void createTask(String title, String description, StatusTask statusTask){

    }

    public void delete(Long id){

    }

    public void updateTask(Long id){

    }

    public List<Task> listAllTasks(){

    }

    public Task searchTask(Long id){

    }
}

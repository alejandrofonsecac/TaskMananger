package com.taskmanager.taskmanager.service;

import com.taskmanager.taskmanager.domain.StatusTask;
import com.taskmanager.taskmanager.domain.Task;
import com.taskmanager.taskmanager.mapper.TaskMapper;
import com.taskmanager.taskmanager.repository.TaskRepository;
import com.taskmanager.taskmanager.requested.TaskPostBodyRequest;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Transactional(rollbackOn = Exception.class)
    public Task createTask(TaskPostBodyRequest taskPostBodyRequest){
        return taskRepository.save(TaskMapper.INSTANCE.toTask(taskPostBodyRequest));
    }
//
//    public void delete(Long id){
//
//    }
//
//    public void updateTask(Long id){
//
//    }

//    public List<Task> listAllTasks(){
//
//    }
//
//    public Task searchTask(Long id){
//
//    }
}

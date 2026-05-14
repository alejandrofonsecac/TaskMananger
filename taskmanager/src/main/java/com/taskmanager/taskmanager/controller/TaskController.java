package com.taskmanager.taskmanager.controller;

import com.taskmanager.taskmanager.domain.Task;
import com.taskmanager.taskmanager.requested.TaskPostBodyRequest;
import com.taskmanager.taskmanager.service.TaskService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@Log4j2
@AllArgsConstructor
public class TaskController {
    private static TaskService taskService;

//    @GetMapping
//    public ResponseEntity<List<Task>> listAll(){
//
//    }
//
//    @GetMapping
//    public ResponseEntity<Task> searchById(){
//
//    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody @Valid TaskPostBodyRequest task){
        return new  ResponseEntity<>(taskService.createTask(task), HttpStatus.CREATED);
    }

//    @DeleteMapping
//    public ResponseEntity<Void> deleteTask(){
//
//    }
//
//    @PutMapping
//    public ResponseEntity<Void> updateTask(){
//
//    }
}

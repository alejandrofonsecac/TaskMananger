package com.taskmanager.taskmanager.controller;

import com.taskmanager.taskmanager.domain.Task;
import com.taskmanager.taskmanager.requested.TaskPostBodyRequest;
import com.taskmanager.taskmanager.requested.TaskPutBodyRequest;
import com.taskmanager.taskmanager.service.TaskService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/task")
@Log4j2
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> listAll(){
        return new ResponseEntity<>(taskService.listAllTasks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> searchById(@PathVariable("id") long id){
        return ResponseEntity.ok(taskService.findByIdOrThrowBadRequestExeption(id));
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody @Valid TaskPostBodyRequest task){
        return new  ResponseEntity<>(taskService.createTask(task), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        taskService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> updateTask(@RequestBody TaskPutBodyRequest taskPutBodyRequest){
        taskService.updateTask(taskPutBodyRequest);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

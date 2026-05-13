package com.taskmanager.taskmanager.controller;

import com.taskmanager.taskmanager.domain.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class TaskController {

    @GetMapping
    public ResponseEntity<List<Task>> listAll(){

    }

    @GetMapping
    public ResponseEntity<Task> searchById(){

    }

    @PostMapping
    public ResponseEntity<Task> createTask(){

    }

    @DeleteMapping
    public ResponseEntity<Void> deleteTask(){

    }

    @PutMapping
    public ResponseEntity<Void> updateTask(){

    }
}

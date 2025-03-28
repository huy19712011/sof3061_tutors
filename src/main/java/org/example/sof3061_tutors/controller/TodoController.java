package org.example.sof3061_tutors.controller;

import lombok.RequiredArgsConstructor;
import org.example.sof3061_tutors.dto.TodoDto;
import org.example.sof3061_tutors.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto) {

        TodoDto savedTodoDto = todoService.addTodo(todoDto);

        return new ResponseEntity<TodoDto>(savedTodoDto, HttpStatus.CREATED);
    }
}


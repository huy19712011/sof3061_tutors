package org.example.sof3061_tutors.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.sof3061_tutors.dto.TodoDto;
import org.example.sof3061_tutors.entity.Todo;
import org.example.sof3061_tutors.repository.TodoRepository;
import org.example.sof3061_tutors.service.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;
    private final ModelMapper modelMapper;

    @Override
    public TodoDto addTodo(TodoDto todoDto) {

        Todo todo = modelMapper.map(todoDto, Todo.class);

        Todo savedTodo = todoRepository.save(todo);

        TodoDto savedTodoDto = modelMapper.map(savedTodo, TodoDto.class);

        return savedTodoDto;
    }
}

package org.example.sof3061_tutors.service;

import org.example.sof3061_tutors.dto.TodoDto;
import org.springframework.stereotype.Service;

@Service
public interface TodoService {

    TodoDto addTodo(TodoDto todoDto);
}

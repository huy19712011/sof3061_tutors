package org.example.sof3061_tutors.repository;

import org.example.sof3061_tutors.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}

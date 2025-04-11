package org.example.sof3061_tutors.repository;

import org.example.sof3061_tutors.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Optional<User> findByUsernameOrEmail(String username, String email);

    Boolean existsByEmail(String email);

    Boolean existsByUsernameOrEmail(String username, String email);
}

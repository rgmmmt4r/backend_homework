package com.example.backend;


import com.example.backend.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Mark this interface as a repository
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Method to find a user by their username

}


package com.example.mcp_server_java.repository;

import com.example.mcp_server_java.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
} 
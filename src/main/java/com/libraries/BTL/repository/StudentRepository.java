package com.libraries.BTL.repository;

import com.libraries.BTL.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByMsv(Integer msv);
}

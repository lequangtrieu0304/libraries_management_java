package com.libraries.BTL.controller;

import com.libraries.BTL.dto.student.StudentDto;
import com.libraries.BTL.model.Student;
import com.libraries.BTL.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentServiceImpl studentServiceImpl;
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody StudentDto studentDto){
        Student result = studentServiceImpl.createStudent(studentDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}

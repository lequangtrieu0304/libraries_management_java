package com.libraries.BTL.service.impl;

import com.libraries.BTL.dto.student.StudentDto;
import com.libraries.BTL.exception.BaseException;
import com.libraries.BTL.model.Student;
import com.libraries.BTL.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {
    @Autowired
    private StudentRepository studentRepository;
    public Student createStudent(StudentDto studentDto) {
        Student studentExist = studentRepository.findByMsv(studentDto.getMsv());
        if(studentExist != null){
            throw new BaseException("Student da ton tai");
        }
        Student newStudent = new Student();
        newStudent.setMsv(studentDto.getMsv());
        newStudent.setName(studentDto.getName());
        newStudent.setAddress((studentDto.getAddress()));
        studentRepository.save(newStudent);
        return newStudent;
    }
}

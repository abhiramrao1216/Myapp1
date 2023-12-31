package com.example.springb.service;

import java.util.List;

import javax.validation.Valid;

import com.example.springb.entity.StudentEntity;

public interface StudentService {

	StudentEntity addStudent(StudentEntity student);

	List<StudentEntity> getAllStudent();

	StudentEntity getStudentById(Integer id);

	StudentEntity updateStudentById(@Valid StudentEntity student, Integer id);

	StudentEntity deleteStudentById(Integer id);

	List<StudentEntity> getStudentByName(String name);

}

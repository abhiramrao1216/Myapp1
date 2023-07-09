package com.example.springb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springb.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	public List<StudentEntity> findByName(String name);
}

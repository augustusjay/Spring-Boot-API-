package com.ajd.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajd.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

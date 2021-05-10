package com.springboot.learnspringboot.corses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.learnspringboot.corses.bean.Course;

public interface CorsesRepository extends JpaRepository<Course,Long>{

}

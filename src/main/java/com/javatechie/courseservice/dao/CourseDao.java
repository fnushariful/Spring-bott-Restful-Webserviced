package com.javatechie.courseservice.dao;

import com.javatechie.courseservice.entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<CourseEntity,Integer> {

}

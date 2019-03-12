package com.caiogarcia.devdovo.course.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.caiogarcia.devdovo.course.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}

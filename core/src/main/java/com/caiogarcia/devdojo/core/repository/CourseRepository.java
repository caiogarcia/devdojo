package com.caiogarcia.devdojo.core.repository;

import com.caiogarcia.devdojo.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}

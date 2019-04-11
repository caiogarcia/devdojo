package com.caiogarcia.devdojo.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EntityScan({"com.caiogarcia.devdojo.core.model"})
@EnableJpaRepositories({"com.caiogarcia.devdojo.core.repository"})
public class CourseApplication {

  public static void main(String[] args) {
    SpringApplication.run(CourseApplication.class, args);
  }

}

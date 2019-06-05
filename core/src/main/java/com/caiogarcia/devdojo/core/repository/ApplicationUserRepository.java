package com.caiogarcia.devdojo.core.repository;

import com.caiogarcia.devdojo.core.model.ApplicationUser;
import com.caiogarcia.devdojo.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {

    public ApplicationUser findByUserName(String userName);
}

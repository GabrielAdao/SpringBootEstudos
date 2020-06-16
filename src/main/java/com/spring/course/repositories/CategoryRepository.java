package com.spring.course.repositories;

import com.spring.course.entities.Category;
import com.spring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

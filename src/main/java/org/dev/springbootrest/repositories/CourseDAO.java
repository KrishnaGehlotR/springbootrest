package org.dev.springbootrest.repositories;

import org.dev.springbootrest.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDAO extends JpaRepository<Course, Long> {

}

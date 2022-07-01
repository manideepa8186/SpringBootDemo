package com.demo.SpringBootTutorial.repository;

import com.demo.SpringBootTutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
  Department findByDepartmentName(String Name);
}

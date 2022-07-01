package com.demo.SpringBootTutorial.service;

import com.demo.SpringBootTutorial.entity.Department;
import com.demo.SpringBootTutorial.error.DepartmentNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
     Department saveDepartment(Department department) ;
     List<Department> getallDepartments();
    Department getdepartmentbyID(Long Id) throws DepartmentNotFoundException;
    String deletedepartmentById(Long Id);
    Department UpdateDepartmentById(Long Id,Department department);

    Department getDepartmentByName(String Name);
}

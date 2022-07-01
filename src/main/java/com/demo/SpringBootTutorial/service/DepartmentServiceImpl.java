package com.demo.SpringBootTutorial.service;

import com.demo.SpringBootTutorial.entity.Department;
import com.demo.SpringBootTutorial.error.DepartmentNotFoundException;
import com.demo.SpringBootTutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class DepartmentServiceImpl implements  DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
    public List<Department> getallDepartments(){
        return  departmentRepository.findAll();
    }

    @Override
    public Department getdepartmentbyID(Long Id) throws DepartmentNotFoundException {

        Optional<Department> dept=departmentRepository.findById(Id);
        if(!dept.isPresent())
            throw new DepartmentNotFoundException("Department Not Availiable");
        return dept.get();
    }

    @Override
    public String deletedepartmentById(Long Id) {
        departmentRepository.deleteById(Id);
        return "Department with Id "+Id+" is Deleted Successfully!!";
    }

    @Override
    public Department UpdateDepartmentById(Long Id,Department department) {
        Department dept=departmentRepository.findById(Id).get();
        if(Objects.nonNull(dept.getDepartmentName()) && !"".equalsIgnoreCase(dept.getDepartmentName()))
         dept.setDepartmentName(department.getDepartmentName());
        if(Objects.nonNull(dept.getDepartmentAddress()) && !"".equalsIgnoreCase(dept.getDepartmentAddress()))
            dept.setDepartmentAddress(department.getDepartmentAddress());
        return  departmentRepository.save(dept);
    }

    @Override
    public Department getDepartmentByName(String Name) {
        return departmentRepository.findByDepartmentName(Name);
    }


}

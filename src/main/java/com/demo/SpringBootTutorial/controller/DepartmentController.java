package com.demo.SpringBootTutorial.controller;

import com.demo.SpringBootTutorial.entity.Department;
import com.demo.SpringBootTutorial.error.DepartmentNotFoundException;
import com.demo.SpringBootTutorial.service.DepartmentService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    Logger logger= LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Validated @RequestBody Department department){
        logger.info("Saving data   "+department.getDepartmentID());
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> getdepartments(){
        return departmentService.getallDepartments();
    }
    @RequestMapping(value="/department/{id}",method = RequestMethod.GET)
    public Department getDepartmentById(@PathVariable("id") Long Id) throws DepartmentNotFoundException {
        return  departmentService.getdepartmentbyID(Id);
    }
    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long id){
        logger.info("deleting data   ");
        return departmentService.deletedepartmentById(id);
    }

    @PutMapping("/department/{id}")
    public Department UpdatedepartmentById(@PathVariable("id") Long id,@RequestBody Department department){
        return  departmentService.UpdateDepartmentById(id,department);
    }
    @GetMapping("/department/find/{Name}")
    public Department FetchDepartmentByName(@PathVariable("Name") String Name) {
        logger.info("Get data   ");
        return departmentService.getDepartmentByName(Name);
    }
}

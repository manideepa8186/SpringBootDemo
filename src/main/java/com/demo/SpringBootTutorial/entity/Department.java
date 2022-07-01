package com.demo.SpringBootTutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long departmentID;
    @NotBlank(message = "Please Add Department Name")
    private  String departmentName;
    private  String departmentAddress;

//    public Long getDepartmentID() {
//        return this.departmentID;
//    }
//    public void setDepartmentID(Long departmentID) {
//        this.departmentID = departmentID;
//    }
//
//    public String getDepartmentName() {
//        return this.departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public String getDepartmentAddress() {
//        return this.departmentAddress;
//    }
//
//    public void setDepartmentAddress(String departmentAddress) {
//        this.departmentAddress = departmentAddress;
//    }
//
//    public Department(Long departmentID, String departmentName, String departmentAddress) {
//        this.departmentID = departmentID;
//        this.departmentName = departmentName;
//        this.departmentAddress = departmentAddress;
//    }
//
//    public Department() {
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "DepartmentID=" + this.departmentID +
//                ", DepartmentName='" + this.departmentName + '\'' +
//                ", DepartmentAddress='" + this.departmentAddress + '\'' +
//                '}';
//    }
}

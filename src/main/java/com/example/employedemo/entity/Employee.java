package com.example.employedemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;
    private String empName;
    private Integer empAge;

    @ManyToOne(cascade=CascadeType.ALL)
    private Department department;


    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Employee() {
    }

    public Employee(Integer empId, String empName, Integer empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }
}

package com.example.employedemo.entity;

import com.example.employedemo.entity.Employee;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer deptId;
    private String deptName;

    private  String str;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="department")
    private List<Employee> employee;

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }



    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Department() {
    }

    public Department(Integer deptId, String deptName, Integer empId) {
        this.deptId = deptId;
        this.deptName = deptName;
        //this.employee = new Employee(empId,"")


    }

}

package com.example.employedemo.controller;

import com.example.employedemo.repository.EmployeeRepository;
import com.example.employedemo.entity.Department;
import com.example.employedemo.repository.DepartmentRepository;
import com.example.employedemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService deptService;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/createDept")
    public String createDept(@RequestBody String param){
        return param;
        /*Optional<Object> dept1 = employeeRepository.findById(empId).map(employee -> {
            deptReq.setEmployee(employee);
            return departmentRepository.save(deptReq);
        });
        return dept1;*/
    }

    @PostMapping("/deptC")
    public Department createDept(Department dept){
        deptService.createOrUpdate(dept);
        return dept;
    }

    @PutMapping("/emp/{empId}/dept/{deptId}")
    public void updateDept(@PathVariable Integer empId,@PathVariable Integer deptId,@RequestBody Department dept){
        deptService.createOrUpdate(dept);
    }

    @GetMapping("/dept")
    public List<Department> getAllDepartments(){
        return deptService.getAllDepartments();
    }

    @GetMapping("/dept/{deptId}")
    public Department getDeptById(@PathVariable Integer deptId){
        return deptService.getDeptById(deptId);
    }

    @DeleteMapping("/dept/delete/{deptId}")
    public void deleteEmp(@PathVariable Integer deptId){
        deptService.deleteDept(deptId);
    }



}

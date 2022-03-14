package com.example.employedemo.controller;

import com.example.employedemo.entity.Employee;
import com.example.employedemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empService;

    @PostMapping("/emp")
    public Employee createOrUpdate(@RequestBody Employee emp){
        empService.createOrUpdate(emp);
        return emp;
    }

    @GetMapping("/emp")
    public List<Employee> getAllEmployee(){
        return empService.getAllEmployee();
    }

    @GetMapping("/emp/{empId}")
    public List<Employee> getEmpById(@PathVariable Integer empId){
        return empService.getEmpById(empId);
    }

    @DeleteMapping("/emp/{empId}")
    public void deleteEmp(@PathVariable Integer empId){
        empService.deleteEmp(empId);
    }

    @GetMapping("/emp/age/{age}")
    public List<Employee> getEmpByAge(@PathVariable Integer age){
        return empService.getEmpByAge(age);
    }

    @GetMapping("/emp/agesort/{age}")
    public List<Employee> getEmpGreaterThan(@PathVariable Integer age){
        return empService.getEmpGreaterThan(age);
    }

    @GetMapping("emp/{id}/{name}")
    public List<Employee> getEmpByIdAndName(@PathVariable Integer id,@PathVariable String name){
        return empService.getEmpByIdAndName(id,name);
    }


}

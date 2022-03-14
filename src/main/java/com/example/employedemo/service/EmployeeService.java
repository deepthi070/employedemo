package com.example.employedemo.service;

import com.example.employedemo.entity.Employee;
import com.example.employedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    EmployeeRepository empRepo;

    public List<Employee> getAllEmployee(){
        return empRepo.findAll();
    }

    public List<Employee> getEmpById(Integer empId){
        return empRepo.findByEmpId(empId);
    }

    public void createOrUpdate(Employee emp){
        empRepo.save(emp);
    }

    public void deleteEmp(Integer empId){
        empRepo.deleteById(empId);
    }

    public List<Employee> getEmpByAge(Integer age){
        return empRepo.findByEmpAge(age);
    }

    public List<Employee> getEmpGreaterThan(Integer age){
        return empRepo.findByEmpAgeGreaterThanEqual(age);
    }

    public List<Employee> getEmpByIdAndName(Integer id,String name){
        return empRepo.findByEmpIdAndEmpName(id,name);
    }
}

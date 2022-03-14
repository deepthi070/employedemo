package com.example.employedemo.repository;

import com.example.employedemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findByEmpAge(Integer age);

    List<Employee> findByEmpId(Integer empId);

    List<Employee> findByEmpAgeGreaterThanEqual(Integer age);

    List<Employee> findByEmpIdAndEmpName(Integer id,String name);
}

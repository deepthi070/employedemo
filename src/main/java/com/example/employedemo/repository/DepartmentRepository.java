package com.example.employedemo.repository;

import com.example.employedemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {


    //List<Department> findByEmpId(Integer empId);




}

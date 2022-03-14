package department.service;

import com.example.employedemo.entity.Employee;
import com.example.employedemo.repository.EmployeeRepository;
import department.entity.Department;
import department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DepartmentService {
    @Autowired
    DepartmentRepository deptRepo;


    public List<Department> getAllDepartments(){

        return deptRepo.findAll();
    }

    public Department getDeptById(Integer deptId){
        return deptRepo.findById(deptId).get();
    }

    public void createOrUpdate(Department dept){
        deptRepo.save(dept);
    }

    public void deleteDept(Integer deptId){
        deptRepo.deleteById(deptId);
    }

}

package department.repository;

import com.example.employedemo.entity.Employee;
import department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {


    List<Department> findByEmpId(Integer empId);




}

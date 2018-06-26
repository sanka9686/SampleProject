package com.SpringFrist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringFrist.Model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
        
}

package com.fatih.departmentservice.repository;

import com.fatih.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentId(Long id);
}

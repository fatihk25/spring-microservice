package com.fatih.departmentservice.service;

import com.fatih.departmentservice.entity.Department;
import com.fatih.departmentservice.repository.IDepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private IDepartmentRepository repository;

    public Department saveDepartment(Department department) {
        log.info("service save");
        return repository.save(department);
    }

    public Department findDepartmentById(Long id) {
        log.info("service get id");
        return repository.findByDepartmentId(id);
    }
}

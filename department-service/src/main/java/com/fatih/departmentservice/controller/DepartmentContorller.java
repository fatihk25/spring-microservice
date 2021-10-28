package com.fatih.departmentservice.controller;

import com.fatih.departmentservice.entity.Department;
import com.fatih.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentContorller {
    @Autowired
    private DepartmentService service;

    @PostMapping("/")
    public Department save(@RequestBody Department department) {
        log.info("Save department method");
        return service.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable Long id) {
        log.info("get department by id method");
        return service.findDepartmentById(id);
    }
}

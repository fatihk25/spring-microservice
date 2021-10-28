package com.fatih.userservice.controller;

import com.fatih.userservice.entity.User;
import com.fatih.userservice.service.UserService;
import com.fatih.userservice.valuesobject.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/")
    public User save(@RequestBody User user) {
        log.info("save method");
        return service.saveUser(user);
    }

    @GetMapping("/{userId}")
    public ResponseTemplate getUserDepartment(@PathVariable Long userId) {
        return service.getUserWithDepartment(userId);
    }
}

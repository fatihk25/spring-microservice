package com.fatih.userservice.service;

import com.fatih.userservice.entity.User;
import com.fatih.userservice.repository.IUserRepository;
import com.fatih.userservice.valuesobject.Department;
import com.fatih.userservice.valuesobject.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private IUserRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("save service");
        return repository.save(user);
    }

    public ResponseTemplate getUserWithDepartment(Long userId) {
        log.info("response template on service");
        ResponseTemplate responseTemplate = new ResponseTemplate();
        User user = repository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                Department.class);

        responseTemplate.setUser(user);
        responseTemplate.setDepartment(department);
        return responseTemplate;
    }
}

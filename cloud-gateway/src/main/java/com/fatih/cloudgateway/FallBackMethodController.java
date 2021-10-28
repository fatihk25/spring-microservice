package com.fatih.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/userServiceFallback")
    public String userServiceFallBackMethod() {
        return "User service is taking longer than expected ." +
                "Please try again later";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallBackMethod() {
        return "Department service is taking longer than expected ." +
                "Please try again later";
    }
}

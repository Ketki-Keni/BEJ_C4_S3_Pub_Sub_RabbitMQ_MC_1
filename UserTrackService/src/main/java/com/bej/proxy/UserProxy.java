package com.bej.proxy;

import com.bej.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="user-authentication-service",url="localhost:8082")
public interface UserProxy {
    @PostMapping("/api/v1/user")
    public ResponseEntity<?> saveUserInAuthService(@RequestBody User user);
}

package org.example.userservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.userservice.dto.request.RegisterDTO;
import org.example.userservice.model.User;
import org.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterDTO request) {
        User user = userService.register(request);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
    @GetMapping("/test")
    public String hello() {
        return "Hello from UserController!";
    }
}

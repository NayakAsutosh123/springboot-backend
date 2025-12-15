package com.asu.website.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asu.website.entity.User;
import com.asu.website.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {


private final UserService service;


public UserController(UserService service) {
this.service = service;
}


@PostMapping
public User saveUser(@RequestBody User user) {
return service.saveUser(user);
}
}

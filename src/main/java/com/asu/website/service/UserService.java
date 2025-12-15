package com.asu.website.service;

import org.springframework.stereotype.Service;

import com.asu.website.entity.User;
import com.asu.website.repo.UserRepository;

@Service
public class UserService {


private final UserRepository repo;


public UserService(UserRepository repo) {
this.repo = repo;
}


public User saveUser(User user) {
return repo.save(user);
}
}

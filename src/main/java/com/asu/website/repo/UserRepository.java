package com.asu.website.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asu.website.entity.User;



public interface UserRepository extends JpaRepository<User, Integer> {
}

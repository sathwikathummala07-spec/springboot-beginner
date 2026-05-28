package com.sathwika.WebProject.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathwika.WebProject.model.User;
import com.sathwika.WebProject.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    UserService userService;

    UserController(){
        userService = new UserService();
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
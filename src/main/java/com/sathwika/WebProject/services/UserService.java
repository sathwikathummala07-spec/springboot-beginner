package com.sathwika.WebProject.services;

import java.util.*;

import com.sathwika.WebProject.model.*;

public class UserService {

    private List<User> allUsers;

    public UserService() {

        allUsers = new ArrayList<>();

        allUsers.add(
            new User(
                "Sathwika",
                "img/jane_doe.png",
                "Female",
                0
            )
        );

        allUsers.add(
            new User(
                "Sathwik",
                "img/john_doe.png",
                "Male",
                1
            )
        );
    }

    public void addUser(String name, String gender, String image) {

        User newUser = new User(
            name,
            image,
            gender,
            allUsers.size()
        );

        allUsers.add(newUser);
    }

    public List<User> getAllUsers() {
        return allUsers;
    }

    public User getSingleUser(Integer id) {
        return allUsers.get(id);
    }

    public void updateUser(
        String name,
        String gender,
        String image,
        int idx
    ) {

        User updUser = new User(
            name,
            image,
            gender,
            idx
        );

        allUsers.set(idx, updUser);
    }

    public void deleteUser(int id) {
        allUsers.remove(id);
    }
}
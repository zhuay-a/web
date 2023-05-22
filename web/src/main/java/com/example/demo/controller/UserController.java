package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper usermapper;
    @Autowired
    private UserService userService;
    @GetMapping("/seemassage")
    public List<User> seem(){
        User user = new User();
        return usermapper.findAll();
    }
    @PostMapping("/save")
    public Integer save(@RequestBody User user) {
        return userService.save(user);
    }
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return usermapper.deleteById(id);
    }
}

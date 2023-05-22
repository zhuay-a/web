package com.example.demo.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/post")
public class UserService {
    @Autowired
    private UserMapper usermapper;
    @PostMapping("/save")
    public int save(@RequestBody User user) {
        if(user.getId() == null)
            return usermapper.insert(user);
        else {
            return usermapper.update(user);
        }
    }
}

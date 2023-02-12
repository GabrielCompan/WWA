package com.users.users.web.controller;
import com.users.users.service.UsersService;
import com.users.users.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

class ValueDto {
    public String name;
    public String email;
    public String password;
}

@RestController
@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;
    @PostMapping(path="/register")
    public @ResponseBody Users addNewUser(@RequestBody ValueDto name, @RequestBody ValueDto email, @RequestBody ValueDto password) {
        return usersService.saveUser(name.name, email.email, password.password);
    }

    @CrossOrigin()
    @PostMapping("/login")
    public int getUsers(@RequestBody ValueDto email, @RequestBody ValueDto password) {
        int login = usersService.verifyLogin(email.email, password.password);
        return login;
    }
}

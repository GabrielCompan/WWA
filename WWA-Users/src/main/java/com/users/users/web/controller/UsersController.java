package com.users.users.web.controller;
import com.users.users.repository.UsersRepository;
import com.users.users.service.UsersService;
import com.users.users.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;
    @PostMapping(path="/register")
    public @ResponseBody String addNewUser(@RequestParam String name
            , @RequestParam String email, @RequestParam String password) {
        usersService.saveUser(name, email, password);
        return "Saved";
    }

    @CrossOrigin()
    @PostMapping("/login")
    public int getUsers(@RequestParam String email, @RequestParam String password) {
        int login = usersService.verifyLogin(email, password);
        return login;
    }


}

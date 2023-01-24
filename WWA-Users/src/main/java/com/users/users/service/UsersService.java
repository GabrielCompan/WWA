package com.users.users.service;

import com.users.users.model.Users;
import com.users.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsersService {
    @Autowired

    private UsersRepository usersRepository;

    public void saveUser(String name, String email, String password) {
        Users n = new Users();
        n.setName(name);
        n.setMail(email);
        n.setPassword(password);
        usersRepository.save(n);
    }
    public Iterable<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public int verifyLogin(String email, String password) {
        Iterable<Users> users = usersRepository.findAll();
        for (Users user : users) {
            if (user.getMail().equals(email) && user.getPassword().equals(password)) {
                return user.getId();
            }
        }
        return -1;
    }
};


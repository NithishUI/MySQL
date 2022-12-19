package com.nithish.app.mysql.controller;


import com.nithish.app.mysql.models.Users;
import com.nithish.app.mysql.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/users")
    public List<Users> getUsers(){
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody Users users){
        userRepo.save(users);
        return "Saved...";
    }

    @PutMapping(value = "update/{id}")
    public  String updateUser(@PathVariable long id, @RequestBody Users users){
        Users updateUser= userRepo.findById(id).get();
        updateUser.setCompany_name(users.getCompany_name());
        updateUser.setModel_name(users.getModel_name());
        updateUser.setModel_type(users.getModel_type());
        updateUser.setFuel_type(users.getFuel_type());
        updateUser.setEngine_spec(users.getEngine_spec());
        updateUser.setColor(users.getColor());
        updateUser.setModel_year(users.getModel_year());
        updateUser.setPrice(users.getPrice());
        updateUser.setSeat_count(users.getSeat_count());
        userRepo.save(updateUser);
        return "Updated...";
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteUser(@PathVariable long id){
        Users deleteUser=userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Delete user with the id: "+id;
    }
}

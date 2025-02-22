package com.nilavo.NomuraUserInformation.controller;

import com.nilavo.NomuraUserInformation.entity.Person;
import com.nilavo.NomuraUserInformation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/classname")
    public ResponseEntity<String> callTheClass()
    {
        String name = this.getClass().getName();
        return new ResponseEntity<>(name,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Person> createUser(@RequestBody Person person)
    {
       Person create = service.createUser(person);
       return new ResponseEntity<>(create, HttpStatus.CREATED);
       //created code 201
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<Person>> getAllUsers()
    {
        List<Person> getAll = service.getAll();
        return new ResponseEntity<>(getAll, HttpStatus.OK);
        //Ok code 200
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Person> getById(@PathVariable Integer id)
    {
        Person getById = service.getById(id);
        return new ResponseEntity<>(getById, HttpStatus.OK);
    }






}

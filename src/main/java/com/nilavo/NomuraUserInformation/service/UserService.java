package com.nilavo.NomuraUserInformation.service;

import com.nilavo.NomuraUserInformation.entity.Person;
import com.nilavo.NomuraUserInformation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public Person createUser(Person person)
    {
        Person personInfo = repo.save(person);
        return personInfo;
    }
    public List<Person> getAll()
    {
        List<Person> personList= repo.findAll();
        return personList;
    }
    public Person getById(int id)
    {
        Optional<Person> personById= repo.findById(id);
        return personById.get();
    }
}

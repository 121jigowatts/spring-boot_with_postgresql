package com.jigowatts.springboot_with_postgresql.service;

import java.util.List;

import javax.transaction.Transactional;

import com.jigowatts.springboot_with_postgresql.domain.Person;
import com.jigowatts.springboot_with_postgresql.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PersonService
 */
@Service
@Transactional
public class PersonService {

    @Autowired
    PersonRepository repository;

    public List<Person> findAll() {
        return repository.findAll();
    }

    public String findByName(String name) {
        Person p = repository.findByName(name);
        if (p == null) {
            return "not found.";
        } else {
            return String.format("NAME:%s AGE:%d", p.getName(), p.getAge());
        }
    }
}
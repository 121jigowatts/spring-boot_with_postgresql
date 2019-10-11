package com.jigowatts.springboot_with_postgresql.controller;

import com.jigowatts.springboot_with_postgresql.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SimpleApiController
 */
@RestController
public class SimpleApiController {

    @Autowired
    PersonService service;

    @RequestMapping("/")
    public String index() {
        return "Hello world!";
    }

    @RequestMapping("/api/person/{name}")
    public String getPerson(@PathVariable String name) {
        return service.findByName(name);
    }
}
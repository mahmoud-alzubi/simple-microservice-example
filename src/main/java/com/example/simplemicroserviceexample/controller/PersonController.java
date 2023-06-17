package com.example.simplemicroserviceexample.controller;

import com.example.simplemicroserviceexample.beans.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
public class PersonController {

    @Value("${app.name}")
    String appName;

    @GetMapping("/hello")
    public String sayHello() {
        return "hello from " + appName;
    }

    @GetMapping("/hello/{name}")
    public String sayHelloWithPathVariable(@PathVariable("name") String name) {
        return "hello ".concat(name);
    }

    @PostMapping("/hello")
    public String sayHelloWithBody(@RequestBody Person person) {
        return "Hello From POST ".concat(person.getName()).concat(" | with Age: " + person.getAge());
    }

    @RequestMapping(value = "/hello", method = RequestMethod.PATCH)
    public String sayHelloWithPatch(@RequestBody Person person) {
        return "Hello From PATCH ".concat(person.getName()).concat(" | with Age: " + person.getAge());
    }

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.DELETE)
    public String deletePerson(@PathVariable("id") int id) {
        return "person ID : " + id + " has been deleted successfully.";
    }
}

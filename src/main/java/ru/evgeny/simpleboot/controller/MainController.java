package ru.evgeny.simpleboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String get(){
        return "Hello";
    }

    @GetMapping("/evening")
    public String evening(){
        return "Hello evening";
    }

}

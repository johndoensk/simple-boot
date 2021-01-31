package ru.evgeny.simpleboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.evgeny.simpleboot.service.SimpleService;

@RestController
public class MainController {

    private final SimpleService simpleService;

    public MainController(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @GetMapping("/hello")
    public String get() {
        return "Hello " + simpleService.getName();
    }

    @GetMapping("/evening")
    public String evening() {
        return "Hello evening" + simpleService.getName();
    }

}

package pt.jorgeduarte.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cv")
public class HomeController {
    @GetMapping
    public String home() {
        return "Hello World!";
    }
}

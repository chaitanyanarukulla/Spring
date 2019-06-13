package com.chaiLab11.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Rcontroller {
    // specify the route (method and path) for this method
        @GetMapping("/hello")
        public String getHelloWorld() {
            return "Hello, world! It's a beautiful day!";
        }
}

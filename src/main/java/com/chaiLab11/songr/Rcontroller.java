package com.chaiLab11.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Rcontroller {
    // specify the route (method and path) for this method
        @GetMapping("/hello")
        public String getHelloWorld() {
            return "Hello, world! It's a beautiful day!";
        }

    @GetMapping("/capitalize/{word}")
    public String getcapitalize(@PathVariable String word) {
        return word.toUpperCase();
    }

    @GetMapping("/reverse")
    public String reverse(@RequestParam String sentance) {
            String[] answer = sentance.split(" ");
            String output = "";
            for (int i = answer.length -1 ; i >=0; i --){
                output += answer[i] + " ";


            }
        return output;
    }
}

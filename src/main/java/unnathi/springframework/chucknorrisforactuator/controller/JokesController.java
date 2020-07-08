package unnathi.springframework.chucknorrisforactuator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import unnathi.springframework.chucknorrisforactuator.services.ChuckNorris;

@RestController
@RequestMapping(value = "joke")
public class JokesController {

    @Autowired
    private ChuckNorris chuckNorris;

    @GetMapping("/")
    public String firstPage(){
       return "My Landing page";

    }

    @GetMapping("/getSingleJoke")
    public String getJokes(){
        return chuckNorris.getRandomJoke();
    }

    @GetMapping("/greetUser/{username}")
    public String greetUser(@PathVariable String username){
        return "Hello " + username + " Welcome to my App";
    }

    @GetMapping("/addTwoNumbers/{a}/{b}")
    public String addTwoNumbers(@PathVariable Integer a, @PathVariable Integer b){
        Integer c = a+b;
        return "Sum of "+ a + ","+b+ " is: "+ c;
    }

    @GetMapping("/doMinus/{c}/{d}")
    public String doMinus(@PathVariable Integer c,@PathVariable Integer d){
        Integer f = c-d;
        return "Minus of " + c + "," +d + " is: "+f;
    }

}

//localhost:8080/joke/getSingleJoke



package faheem.microservices.greetings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class controller {

    @GetMapping("/")
    public String greetings(){
        return "good morning";
    }
}

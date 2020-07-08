package unnathi.springframework.chucknorrisforactuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingPageController {

    @GetMapping("/")
    public String myLandingPage(){

        return "Saperate controller for landing page";
    }

}

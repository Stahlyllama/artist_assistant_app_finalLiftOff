package org.launchcode.artist_assistant_app_finalLiftOff.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/helloworld")
    public String displayHello(){
        return "helloWorld";
    }
}

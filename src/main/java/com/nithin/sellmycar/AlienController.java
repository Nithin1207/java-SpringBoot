package com.nithin.sellmycar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.*;

@Controller
public class AlienController {

    @RequestMapping("/")
    public String homePage() {
        System.out.println("index page");
        return "index";
    }

    @RequestMapping("/calculate")
    public String calculate(Result result) {

        return "result";
    }

}

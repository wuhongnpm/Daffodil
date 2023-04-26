package com.ruidu.ruidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/info")
    @ResponseBody
    public String getInfoFromIdea() {
        return "This is janpanses love";
    }

}

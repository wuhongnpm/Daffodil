package com.ruidu.ruidu.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class CnController {
    @GetMapping("/info")
    @ResponseBody
    public String getInfoFromIdea() {
        return  "This is String demo";
    }
}

package daveallengroup.springdata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllenController {
    @RequestMapping("/allen")
    public String allen(){
        return "Yes I can";
    }
}

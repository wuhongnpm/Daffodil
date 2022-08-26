package daveallengroup.springdata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@RestController注释相当于@ResponseBody +@Controller合在一起
@RestController
public class HelloCtontroller {
    @RequestMapping("/hello")
    public String hello(String name)
    {
        return "Can you Felling"+name;
    }
}

package daveallengroup.springdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller作用是使本类充当一个控制器
@Controller
public class TestController {
    //@RequestMapping是将"/test"的URL路径映射到该方法
    @RequestMapping("test")
    public void test(){
        System.out.println("Shan");
    }
}

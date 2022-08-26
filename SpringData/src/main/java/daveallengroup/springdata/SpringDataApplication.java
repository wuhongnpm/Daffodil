package daveallengroup.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan  //进行包扫描
@EnableAutoConfiguration   //表示开启自动化配置,会自动进行Spring和SpringMVC的配置.
@SpringBootApplication  //组合上面两个依赖.简写
public class SpringDataApplication {

    //启动类,main方法,通过SpringApplication中的run方法启动项目,第一个参数传入SpringDataApplication.class,告诉Spring哪个是主要组件
    //第二个参数是运行时输入的其它参数.
    public static void main(String[] args)
    {
        SpringApplication.run(SpringDataApplication.class, args);
    }

}


package daveallengroup.springdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
/*
        创建Book实体类,承载返回数据,在BookController中,第11-21行构建返回数据,第22-25行创建返回ModelAndView,设置视图为books,
        返回数据为所插件的List集合

 */
/*
public class BookController {
    private Integer id;
    private String name;
    private String author;
    //省略getter/setter

    @Controller
    public static class BookController {
        @GetMapping("/books")
        public ModelAndView books() {
            List<daveallengroup.springdata.controller.BookController> books = new ArrayList<>();
            daveallengroup.springdata.controller.BookController b1 = new daveallengroup.springdata.controller.BookController();
            b1.setId(1);
            b1.setAuthor("JIM");
            b1.setName("BOKS");
            daveallengroup.springdata.controller.BookController b2 = new daveallengroup.springdata.controller.BookController();
            b2.setId(2);
            b2.setAuthor("Tim");
            b2.setName("BSD");
            books.add(b1);
            books.add(b2);
            ModelAndView mv = new ModelAndView();
            mv.addObject("books", books);
            mv.setViewName("books");
            return mv;
        }
    }
};

*/
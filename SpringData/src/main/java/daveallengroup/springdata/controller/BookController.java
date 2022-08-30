package daveallengroup.springdata.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController
public class BookController {
    public class Book{
        private String name;
        private String author;
        @JsonIgnore
        private Float price;
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date publicationDate;
    }
    @GetMapping("/book")
    public Book book() {
        Book book = new Book();
        book.setAuthor("JIm");
        book.setName("mo");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }
}
*/
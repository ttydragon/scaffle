package scaffle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import scaffle.domain.Book;
import scaffle.service.BookRepository;

/**
 * Created by Iryna on 12.03.2015.
 */
@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/")
    public String index() {
        return "Do you like books?";
    }

    @RequestMapping("/book")
    @ResponseBody
    public String saveBook() {
        Book book = new Book("Author", "Book title");
        bookRepository.save(book);
        return "Book saved";
    }
}

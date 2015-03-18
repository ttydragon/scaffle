package scaffle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scaffle.domain.Book;
import scaffle.service.BookRepository;

/**
 * Created by Iryna on 12.03.2015.
 */
@RestController
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/")
    public String index() {
        return "Do you like books?";
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    @Transactional(readOnly = true)
    public @ResponseBody Book getBook(@PathVariable("id") long id) {
        return bookRepository.findOne(id);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody long saveBook(@RequestBody(required = true) Book book) {
        return bookRepository.save(book).getId();
    }
}

package scaffle.service;

import scaffle.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Iryna on 14.03.2015.
 */
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);
}

package daaw.bookapp.persistence.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import daaw.bookapp.persistence.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
package daaw.bookapp.persistence.repo;

import org.springframework.data.repository.CrudRepository;

import daaw.bookapp.persistence.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}

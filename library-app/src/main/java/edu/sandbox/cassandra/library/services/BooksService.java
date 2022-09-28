package edu.sandbox.cassandra.library.services;

import edu.sandbox.cassandra.library.core.operations.CrudOperations;
import edu.sandbox.cassandra.library.domain.Book;

public interface BooksService extends CrudOperations<Book> {

    void updateBookTitleById(String id, String newTitle);
}

package org.semicolon.stub;

import java.util.List;

public class BookRepositoryStub implements BookRepository {
    @Override
    public List<Book> findNewBook(int days) {
        return null;
    }
}

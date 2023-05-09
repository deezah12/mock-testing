package fake;

import dummy.FakeBookRepository;
import org.junit.Test;
import org.semicolon.fake.Book;
import org.semicolon.fake.BookRepository;
import org.semicolon.fake.BookService;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class FakeTest {

    @Test
    public  void test(){
        BookRepository bookRepository = new FakeBookRepository();
        BookService bookService = new BookService(bookRepository);

        bookService.addBook(new Book("Java", "1", LocalDateTime.now(), 200));
        bookService.addBook(new Book("Go", "2", LocalDateTime.now(), 400));


        assertEquals(2, bookService.findNumberOfBooks());
    }
}

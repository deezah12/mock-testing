package org.semicolon.dummy;

public class BookService {
    public BookRepository bookRepository;
    private EmailService emailService;

    public BookService (BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public int findNumberOfBooks(){
       return bookRepository.findAll().size();
    }
}

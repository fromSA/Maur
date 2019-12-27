package Objects;

import Exceptions.BookNotFoundException;
import Exceptions.UnKnownBookException;
import java.util.Stack;

public class BookPack {
    Stack<Book> books;
    ISBN isbn;

    public ISBN getIsbn() {
        return isbn;
    }

    public int getCount() {
        return count;
    }

    int count;

    public BookPack(ISBN isbn) {
        this.books = new Stack<>();
        this.isbn = isbn;
        this.count = 0;
    }

    public Book takeBook(ISBN isbn) throws BookNotFoundException {
        if(this.isbn.equals(isbn) || books.isEmpty()) throw new BookNotFoundException();
        return books.pop();
    }

    public void registerBook(Book book) throws IllegalArgumentException{
        if (book.getISBN() != this.isbn) throw new  IllegalArgumentException("This is the wrong isbn!");
        books.push(book);
        count++;
    }

    public boolean isEmpty() {
        return false;
    }

    public void returnBook(Book book) throws UnKnownBookException{
        if(book.getISBN()!=this.isbn) throw new UnKnownBookException();
        else books.push(book);
    }
}

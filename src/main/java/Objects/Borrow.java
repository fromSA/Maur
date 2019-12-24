package Objects;

import Exceptions.UnKnownBookException;
import Users.Student;

import java.time.*;

public class Borrow {
    private Book book;
    private Student by;
    private LocalDateTime borrowTime;
    private Shelf fromShelf;
    private Box fromBox;
    private boolean returned = false;
    private LocalDateTime returnTime;
    private Shelf toShelf;
    private Box toBox;

    public Book getBook() {
        return book;
    }

    public Student getBy() {
        return by;
    }

    public LocalDateTime getBorrowTime() {
        return borrowTime;
    }

    public Shelf getFromShelf() {
        return fromShelf;
    }

    public Box getFromBox() {
        return fromBox;
    }

    public boolean isReturned() {
        return returned;
    }

    public LocalDateTime getReturnTime() {
        return returnTime;
    }

    public Shelf getToShelf() {
        return toShelf;
    }

    public Box getToBox() {
        return toBox;
    }
    
    public Borrow(Book book, Student by, LocalDateTime borrowTime, Shelf fromShelf, Box fromBox) {
        this.by = by;
        this.borrowTime = borrowTime;
        this.fromShelf = fromShelf;
        this.fromBox = fromBox;
        this.book = book;
    }

    public void ReturnBook(Book book, LocalDateTime returnTime, Shelf toShelf, Box toBox)throws UnKnownBookException{
        if (!book.equals(this.book)) throw new UnKnownBookException();
        returned = true;
        this.returnTime = returnTime;
        this.toShelf = toShelf;
        this.toBox = toBox;
    }


}

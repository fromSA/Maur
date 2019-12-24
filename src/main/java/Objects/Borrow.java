package Objects;

import Users.Student;

import java.sql.Time;

public class Borrow {
    Book book;
    Student by;
    Time at;
    Shelf fromShelf;
    Box fromBox;

    public Borrow(Book book, Student by, Time at, Shelf fromShelf, Box fromBox) {
        this.by = by;
        this.at = at;
        this.fromShelf = fromShelf;
        this.fromBox = fromBox;
        this.book = book;
    }
}

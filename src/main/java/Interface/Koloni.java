package Interface;

import Exceptions.BookNotFoundException;
import Exceptions.UnKnownBookException;
import Objects.Book;
import Objects.Shelf;
import Objects.BookPack;
import Users.Admin;
import Users.IUser;
import Users.Student;

import java.util.*;

public class Koloni {
    private Set<Shelf> shelves;
    private Set<IUser> admins;
    private Set<IUser> students;
    private HashMap<Integer, BookPack> books;

    public Set<Shelf> getShelves() {
        return shelves;
    }

    public Set<IUser> getAdmins() {
        return admins;
    }

    public Set<IUser> getStudents() {
        return students;
    }

    public HashMap<Integer, BookPack> getBooks() {
        return books;
    }

    public Koloni() {
        shelves = new HashSet<>();
        admins = new HashSet<>();
        students = new HashSet<>();
        books = new HashMap<>();
    }

    // TODO Registry
    public void registerShelf(Shelf shelf) {
        shelves.add(shelf);
    }

    public void registerStudent(Student student) {
        students.add(student);
    }

    public void registerAdmin(Admin admin) {
        admins.add(admin);
    }

    public void registerBook(Book book) {
        BookPack pack;
        if (books.containsKey(book.getISBN())) {
            pack = books.get(book.getISBN());
            pack.registerBook(book);
        } else {
            pack = new BookPack(book.getISBN());
            pack.registerBook(book);
            books.put(book.getISBN(), pack);
        }


    }

    // TODO retrieval
    public Book takeBook(int isbn) throws BookNotFoundException {
        if (!books.containsKey(isbn)) throw new BookNotFoundException();
        else return books.get(isbn).takeBook(isbn);
    }

    //TODO insertion
    public void returnBook(Book book) throws UnKnownBookException {
        if (!books.containsKey(book.getISBN())) throw new UnKnownBookException();
        else books.get(book.getISBN()).returnBook(book);
    }

}

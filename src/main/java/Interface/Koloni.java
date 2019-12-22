package Interface;

import Exceptions.BookNotFoundException;
import Objects.Book;
import Objects.Shelf;
import Users.Admin;
import Users.IUser;
import Users.Student;

import java.util.*;

public class Koloni {
    private Set<Shelf> shelves;
    private Set<IUser> admins;
    private Set<IUser> students;
    private HashMap<Integer,Stack<Book>> books;

    public Set<Shelf> getShelves() {
        return shelves;
    }

    public Set<IUser> getAdmins() {
        return admins;
    }

    public Set<IUser> getStudents() {
        return students;
    }

    public HashMap<Integer,Stack<Book>> getBooks() {
        return books;
    }

    public Koloni(){
        shelves = new HashSet<>();
        admins = new HashSet<>();
        students = new HashSet<>();
        books = new HashMap<>();
    }

    // TODO Registry
    public void registerShelf(Shelf shelf){
        shelves.add(shelf);
    }
    public void registerStudent(Student student){
        students.add(student);
    }
    public void registerAdmin(Admin admin){
        admins.add(admin);
    }
    public void registerBook(int isbn, Book book){
        Stack<Book> l = new Stack<>();
        if(books.containsKey(isbn)){
            l = books.get(isbn);
        }
        l.push(book);
        books.put(isbn,l);
    }

    // TODO retrieval
    public Book takeBook(int isbn) throws BookNotFoundException {
        if(!books.containsKey(isbn) || books.get(isbn).isEmpty()) throw new BookNotFoundException();
        return books.get(isbn).pop();
    }
}

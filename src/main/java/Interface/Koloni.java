package Interface;

import Objects.Book;
import Objects.Shelf;
import Users.Admin;
import Users.IUser;
import Users.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Koloni {
    private Set<Shelf> shelves;
    private Set<IUser> admins;
    private Set<IUser> students;

    public Set<Shelf> getShelves() {
        return shelves;
    }

    public Set<IUser> getAdmins() {
        return admins;
    }

    public Set<IUser> getStudents() {
        return students;
    }

    public Set<Book> getBooks() {
        return books;
    }

    private Set<Book> books;

    public Koloni(){
        shelves = new HashSet<>();
        admins = new HashSet<>();
        students = new HashSet<>();
        books = new HashSet<>();
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

    public void registerBook(Book book){
        books.add(book);
    }
}

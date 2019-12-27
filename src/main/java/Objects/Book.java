package Objects;

import Users.IUser;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private IUser owner;
    private ISBN isbn;
    private Shelf inShelf;
    private Box inBox;
    private Stack<Borrow> history;

    public Book(String title, IUser owner, ISBN isbn){
        this.title = title;
        this.owner = owner;
        id = UUID.randomUUID();
       this.isbn = isbn;
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ISBN getISBN() {
        return isbn;
    }

    public List<Borrow> getHistory() {
        //TODO
        return null;
    }

    public void borrow(IUser by) {
        Borrow b = new Borrow(this,by,inShelf,inBox);
        history.push(b);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}

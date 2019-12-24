package Objects;

import Users.IUser;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private IUser owner;
    private int isbn;
    private List<Shelf> history;

    public Book(String title, IUser owner, int isbn){
        this.title = title;
        this.owner = owner;
        id = UUID.randomUUID();
       this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) &&
                owner.equals(book.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, owner);
    }

    public String getTitle() {
        return title;
    }

    public Integer getISBN() {
        return isbn;
    }

    public List<Borrow> getHistory() {
        //TODO
        return null;
    }
}

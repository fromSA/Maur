package Objects;

import Users.IUser;

import java.util.Objects;
import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private IUser owner;

    public Book(String title, IUser owner){
        this.title = title;
        this.owner = owner;
        id = UUID.randomUUID();
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
}

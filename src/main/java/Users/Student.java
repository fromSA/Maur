package Users;

import Objects.Book;

import java.util.List;
import java.util.UUID;

public class Student implements IUser{
    private UUID id;
    private String name;

    @Override
    public UUID getID() {
        return id;
    }

    public List<Book> getBooksUsed() {
        //TODO
        return null;
    }
}

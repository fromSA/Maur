package Users;

import java.util.UUID;

public class Student implements IUser{
    private UUID id;
    private String name;

    @Override
    public UUID getID() {
        return id;
    }
}

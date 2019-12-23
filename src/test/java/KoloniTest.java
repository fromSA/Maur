import Interface.Koloni;
import Objects.Book;
import Users.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoloniTest {
    @Test
    public void shouldRegisterOneBook(){
        int isbn = 1234;
        Book b = new Book("Calculus", new Student(), isbn);
        Koloni k = new Koloni();
        k.registerBook(b);
        assertEquals(1, k.getBooks().size());
    }

    @Test
    public void shouldRegisterUniqueBooks(){
        Student st = new Student();
        int isbn = 1234;
        Book b = new Book("Calculus", st, isbn);
        Koloni k = new Koloni();
        k.registerBook(b);
        k.registerBook(b);
        assertEquals(1, k.getBooks().size());
    }


}

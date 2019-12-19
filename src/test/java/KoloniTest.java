import Interface.Koloni;
import Objects.Book;
import Users.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoloniTest {
    @Test
    public void shouldRegisterOneBook(){
        Book b = new Book("Calculus", new Student());
        Koloni k = new Koloni();
        k.registerBook(b);
        assertEquals(1, k.getBooks().size());
    }

    @Test
    public void shouldRegisterUniqueBooks(){
        Student st = new Student();
        Book b = new Book("Calculus", st);
        Koloni k = new Koloni();
        k.registerBook(b);
        k.registerBook(b);
        System.out.println( k.getBooks().size());
        assertEquals(1, k.getBooks().size());
    }
}

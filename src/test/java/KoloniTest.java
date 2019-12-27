import Interface.Koloni;
import Objects.Book;
import Objects.ISBN;
import Users.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoloniTest {
    //@Test
    public void shouldRegisterOneBook(){
        ISBN isbn = new ISBN(1,2,3,4,4);
        Book b = new Book("Calculus", new Student(), isbn);
        Koloni k = new Koloni();
        //k.registerBook(b, con);
        //assertEquals(1, k.getBooks().size());
    }

    //@Test
    public void shouldRegisterUniqueBooks(){
        Student st = new Student();
        ISBN isbn = new ISBN(1,2,3,4,6);
        Book b = new Book("Calculus", st, isbn);
        Koloni k = new Koloni();
        //k.registerBook(b, con);
       // k.registerBook(b, con);
        //assertEquals(1, k.getBooks().size());
    }


}

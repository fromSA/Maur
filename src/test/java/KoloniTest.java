import Interface.Koloni;
import Objects.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoloniTest {
    @Test
    public void shouldRegisterOneBook(){
        Book b = new Book();
        Koloni k = new Koloni();
        k.registerBook(b);
        assertEquals(1, k.getBooks().size());
    }
}

package Interface;

import Objects.*;
import Users.Student;

import java.sql.*;

import java.util.*;

public class Koloni {

    public Koloni() {
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8999/mydb", "root", "root");
            //here sonoo is database name, root is username and password
            
            Student student = new Student();
            Book book = new Book("Superintelligence", student, new ISBN(978, 0, 19, 873983, 8));
            //registerBook(book, con);
            List<Book> books = getBooks(con);
            for (Book b : books) {
                System.out.println(b);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void registerBook(Book book, Connection con) {
        String insertBook;
        try {
            insertBook = String.format("insert into Book (idBook, Title) VALUES (%d,'%s')", book.getISBN().toLong(), book.getTitle());
            Statement stmt = con.createStatement();
            stmt.executeUpdate(insertBook);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static List<Book> getBooks(Connection con) {
        List<Book> books = new ArrayList<Book>();
        try {
            String getAllBooks = "select * from Book";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(getAllBooks);

            while (rs.next()) {
                System.out.println(rs.getString(2));
                String title = rs.getString(2);
                books.add(new Book(title));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return books;
    }

}

package Interface;


import Objects.Book;
import Users.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentPage {
    private Student student;
    private ArrayList<Book> books;
    private ArrayList<Book> booksRented;

    public void run(Scanner in) {
        logIn();
        String askForOptions = "rent a book (0)\n return a book (1)\n getInactive Books rented (2) \n get Acrtive rented books (3)";
        System.out.println(askForOptions);
        int chosenOption = in.nextInt();
        switch (chosenOption){
            case 0: rentBook();
            case 1: returnBook();
            case 2:
                System.out.println(Arrays.deepToString(new ArrayList[]{getInactiveBooks()}));
            case 3:
                System.out.println(Arrays.deepToString(new ArrayList[]{getActiveBooks()}));
        }
    }

    private void logIn(){

    }
    private void rentBook(){

    }
    private void returnBook(){

    }
    public ArrayList<Book> getInactiveBooks(){
        return books;
    }

    public ArrayList<Book> getActiveBooks() {
        return booksRented;
    }

}

package Interface;

import java.util.Scanner;

public class Interface {

    public void run() {
        Scanner in = new Scanner(System.in);
        logIn(in);
        in.close();
    }

    private void logIn(Scanner in) {
        String askUserType = "Student (0) or Admin (1) ?";
        System.out.println(askUserType);
        int user = in.nextInt();
        if(user==0) {
            StudentPage stud =  new StudentPage() ;
            stud.run(in);
        }
        else AdminPage.run(in);

    }
}

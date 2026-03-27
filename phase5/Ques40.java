package phase5;

import java.util.Scanner;

// 40- Print hello until user gives wrong input using do while

public class Ques40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Hello!");
            
            System.out.println("Press 'Y' for Print Hello!");
            ch = sc.next().charAt(0);
                        
        } while (ch == 'Y');

        System.out.println("Wrong Input!");

    }
}
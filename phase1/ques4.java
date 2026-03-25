// 4- Accept the User's name, age and print in following manner
// 	Ex - Hello Shery, you are 12 years old.

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Student Name");
     String name = sc.nextLine();   
     System.out.println("Enter student age");
     int age = sc.nextInt();

     sc.close();

     System.out.println("Hello, "+ name + " You are "+ age + " year's old.");

    }
}

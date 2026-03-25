// 6- Accept two numbers from user and swap their values
//                 Part 2 - Swap without using third variable

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Integer:");
        int num1 = sc.nextInt(); // 10
        int num2 = sc.nextInt(); // 20

        sc.close();

        System.out.println("Before Swap num1 = "+ num1 + " num2 = "+ num2);

        num1 = num1 + num2; // 30
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swap num1 = "+ num1 + " num2 = "+ num2);


    }    
}

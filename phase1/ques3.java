// 3- Accept two integers from user and print the sum
// 	Ex - The sum of 45 & 12 = 57

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two integer");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        sc.close();
        
        System.out.println("The sum of "+ num1 + " & "+ num2 +" = "+ (num1+num2));
        

    }
}

package phase3;

import java.util.Scanner;

// 18- Accept three numbers and print the greatest among them

public class ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        sc.close();

        if (num1 > num2 & num1 > num3) {
            System.out.println("Greatest Number: "+ num1);
        }else if(num2 > num1 & num2 > num3){
            System.out.println("Greatest Number: "+ num2);
        }else{
            System.out.println("Greatest Number: "+ num3);
        }

    }
}

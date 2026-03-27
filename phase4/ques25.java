package phase4;

import java.util.Scanner;

// 25- Reverse for loop. Print n to 1.

public class ques25 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        for (int i = n; i > 0; i--) {
            System.out.print(i+" ");
        }

        sc.close();
   } 
}

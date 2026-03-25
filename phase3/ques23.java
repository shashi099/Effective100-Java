package phase3;

import java.util.Scanner;

// 23- Accept an integer and Print hello world n times

public class ques23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N for N Times Hello!");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Helllo!");
        }


        sc.close();
    }
}

package phase2;
// 9- Accept the three sides of triangle and calculate the area using herons formula

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides of Triangle:");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        double s = (s1+s2+s3)/2;

        System.out.println("Area By Using Herone's: " +  Math.sqrt(s * (s-s1) * (s-s2) * (s-s3)));

        sc.close();
    }
}

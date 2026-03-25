package phase2;

import java.util.Scanner;

// 8- Accept the parameters and calculate the Compound Interest & print it on STDOUT (Use Math class methods)


public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter P:");
        int p = sc.nextInt();

        System.out.println("Enter r:");
        float r = sc.nextFloat();

        System.out.println("Enter t:");
        int t = sc.nextInt();

        System.out.println("Enter n:");
        int n = sc.nextInt();

        sc.close();

        double temp = 1 + (r/n);

        double calc = p + (Math.pow(temp , n*t));
        System.out.println(calc);
    }    
}

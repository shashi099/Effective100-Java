package phase2;

import java.util.Scanner;
// 7- Accept the length and width of a rectangle. Calculate & print the area and perimeter.


public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter len of Rectangle");
        int len = sc.nextInt();
        System.out.println("Enter wid of Rectangle");
        int wid = sc.nextInt();

        sc.close();

        System.out.println("Area of Rectangle : "+ (len*wid));
        System.out.println("Perimeter of Rectangle: "+ 2*(len + wid));

    }
}

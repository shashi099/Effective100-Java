package phase6;

public class Ques49 {
    public static void main(String[] args) {
        // 49- Inverted Right Triangle
            // * * * * *
            // * * * *
            // * * *
            // * *
            // *

        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

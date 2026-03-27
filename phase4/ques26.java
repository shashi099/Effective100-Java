package phase4;

// 26- Take a number as input and print its table
    //    5 * 1 = 5
    //    5 * 2 = 10 ... up to 10 terms

public class ques26 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }

    }
}

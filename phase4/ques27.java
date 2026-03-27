package phase4;

// 27- Sum up to n terms.

public class ques27 {
    public static void main(String[] args) {
        
        int n = 5;

        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            totalSum += i;
        }

        System.out.println("Total Sum Up To: "+ totalSum);

    }
}

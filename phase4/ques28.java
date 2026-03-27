package phase4;
// 28- Factorial of a number

public class ques28 {
    public static void main(String[] args) {
        int n, temp;
        n = temp = 5;
        int fact = 1;

        while(temp > 0){
            fact *= temp;
            temp--;
        }

        System.out.println("Factorial of "+ n + " = "+ fact);

    }    
}

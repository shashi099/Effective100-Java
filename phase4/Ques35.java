package phase4;

// 35- Sum of digits of a number, 936 = 18


public class Ques35 {
    public static void main(String[] args) {
        int num = 936;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }

        System.out.println("Sum of Digits:" + sum);
        
    }
    
}

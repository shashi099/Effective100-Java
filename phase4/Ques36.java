package phase4;

// 36- Accept a number and print its reverse

public class Ques36 {
    public static void main(String[] args) {
        int num = 321;   
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num /10;
        }

        System.out.println("Reverse of num:" + rev);

    }    
}
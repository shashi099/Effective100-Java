package phase4;

// 37- Accept a number and check if it is a palindromic number (If number and its reverse are equal)
//        Ex - 12321 - Reverse - 12321

public class Ques37 {
 
    public static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int rev = 0;

        while (temp > 0) {
            int rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp /10;
        }

        if (num == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


    }

}

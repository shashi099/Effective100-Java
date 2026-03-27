package phase4;

//38- Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
    //    Ex- 145 = 1! + 4! + 5! = 145

public class Ques38 {
    public static void main(String[] args) {
        int num = 40585;
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += fact(rem);
            num = num /10; 
        }

        System.out.println(originalNum == sum ? "Strong" : "Not Strong");
    }

    static int fact(int num){
        int mul = 1;
        while (num > 0) {
            mul *= num;
            num--;
        }
        return mul;
    }

}

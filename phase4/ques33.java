package phase4;

// 33- Write a program to take two inputs a, b & find the value of a  raised to the power of b. 
	// Ex - a = 2, b = 5
	// OP - 2^5 = 32

public class ques33 {

    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int power = 1;

        for (int i = 1; i <= b; i++) {
            power *= a;
        }

        System.out.println(" 2 Power 5 = " + power);
    }
    
}

package phase4;

// 34- Separate each digit of a number and print it on the new line ex - 123 
// 	OP
// 		3
// 		2
// 		1


public class ques34 {
    public static void main(String[] args) {
        int num = 123;

         while(num > 0){
            int rem = num % 10;
            System.out.println(rem);
            num = num / 10;
         }

    }
}

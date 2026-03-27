package phase4;

// 29- Print the sum of all even & odd numbers in a range separately.

public class ques29 {
    public static void main(String[] args) {
        int range = 20;

        int evenSum = 0;
        int oddSum = 0;

        for (int index = 0; index <= range; index++) {
             if(index % 2 == 0){
                evenSum += index;
             }else{
                oddSum += index;
             }
        }
        System.out.println(evenSum + " "+ oddSum);
    }
}

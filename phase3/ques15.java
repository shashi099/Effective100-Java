package phase3;

import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution obj = new Solution();

        System.out.println("Enter an Integer:");
        obj.setData(sc.nextInt());

        obj.checkEvenOdd();

    }
}

// 15- Accept an integer and check whether it is an even number or odd.


class Solution{

    int number;

    void setData(int num){
        number = num;
    }

    void checkEvenOdd(){
        if ( number% 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }


}
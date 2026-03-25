package phase3;

import java.util.Scanner;

// 17- Accept a day number between 1-7 and print the corresponding dayname.
public class ques17 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        System.out.println("Enter a number BTW 1 -> 7");
        int day = sc.nextInt();

        sc.close();

        if(day == 1){
            System.out.println("Monday");
        }else if(day == 2){
            System.out.println("Tue");
        }else if(day == 3){
            System.out.println("Wed");
        }else if(day == 4){
            System.out.println("Thur");
        }else if(day == 5){
            System.out.println("Fri");
        }else if(day == 6){
            System.out.println("Sat");
        }else if(day == 7){
            System.out.println("Sun");
        }else{
            System.out.println("Invalid Input!");
        }

    }
    
}


 
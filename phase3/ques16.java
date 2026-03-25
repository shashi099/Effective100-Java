package phase3;

import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution obj = new Solution();

        System.out.println("Enter name age of the user!");
        obj.name = sc.nextLine();
        obj.age = sc.nextInt();
        
        obj.Display();


    }
}

// 16- Accept name and age from the user. Check if the user is a valid voter or not.
    //   Valid - Hello Shery, You are a valid voter.
    //   Invalid - Sorry Shery, you can't cast the vote.
	// Part 2 - Print after how many years the user will be eligible

class Solution {

    String name;
    int age;

    void Display(){
        if (age <= 18){
            System.out.println("Hello " + name.toUpperCase() + ", you are Not valid voter! you need " + (18-age) + " more year to become valid voter!");
        }else{
            System.out.println("Hello " + name.toUpperCase() + ", you are valid voter ");
        }
    }
    
}
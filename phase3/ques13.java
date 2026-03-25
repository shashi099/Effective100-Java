package phase3;

import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Gender as Female: F|f or Male: m|M ");
        String gender = sc.next();

        sc.close();
        
        Main obj = new Main(gender);
 
    }
}

// 13- Accept the gender from the user as char and print the respective greeting message
    //   Ex - Good Morning Sir (on the basis of gender)


    // or/

    // 14- Extend the previous program and handle the wrong inputs.
    //   Print Good Morning sir for input m or M & Good morning Ma'am for input F or f 
    //   else print Wrong Input

class Main{

    Main(String s){

        s = s.toLowerCase();

        if (s.equals("m")){
            System.out.println("Good Morning Sir");
        }else if(s.equals("f")){
            System.out.println("Good Morning Ma'am ");
        }else{
            System.out.println("Something went Wrong.");
        }
    }

}
package phase3;

import java.util.Scanner;

// 22- Accept an English alphabet from user and check if it is a consonant or a vowel;

public class ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main obj = new Main();
        System.out.println("Enter Text to Check!");
        obj.alpha = sc.next();

        sc.close();

        obj.check(obj.alpha);        

    }
}

class Main{

    String alpha;
    
    void check(String str){
        str = str.toLowerCase();

        if(str.equals("a") || str.equals("e") || str.equals("i") ||
            str.equals("o") || str.equals("u") ){
                System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }

}

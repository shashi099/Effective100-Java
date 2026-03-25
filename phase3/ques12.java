package phase3; 

import java.util.Scanner;

// 12- Accept two numbers and print the greatest between them

public class ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        Main Q = new Main();
    
        System.out.println("Enter Two Numbers");
        Q.setData(sc.nextInt(), sc.nextInt());
    
        Q.display();
    
    }
    
}

class Main{
    int num1;
    int num2;
    
    void setData(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
     }
    
    void display(){
        if (num1 > num2) {
            System.out.println("Greatest Num: "+ num1);
        }else{
            System.out.println("Greatest Num: "+ num2);            
        }
    }
}

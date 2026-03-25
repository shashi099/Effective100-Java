package phase3;

import java.util.Scanner;

public class ques19{
    public static void main(String[] args) {
        Main obj = new Main();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year for check it's Leap or Not");
        int year = sc.nextInt();

        sc.close();

        obj.setYear(year);
 
        obj.display();

    }
}

// 19- Accept a year and check if it a leap year or not (google to find out what's a leap year)
class Main{
    private int year;

    void setYear(int year){
        this.year = year;
    }

    int getYear(){
        return this.year;        
    }

    void display(){
        // int year = getYear();
        if (getYear() % 400 == 0  || (getYear() % 100 != 0 && getYear() % 4 == 0) ){
            System.out.println("leap");
        }else{
            System.out.println("Not Leap");
        }
    }

}
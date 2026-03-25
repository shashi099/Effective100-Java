package phase3;

import java.util.Scanner;

// 20- Shop discount - Description on Graphic
// ₹0 – ₹1000 → No discount
// ₹1001 – ₹5000 → 10% discount
// ₹5001 – ₹10000 → 20% discount
// Above ₹10000 → 30% discount

// 👉 Calculate final payable amount.

public class ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Discount! Discount! Discount! \n");
        System.out.println("RS. 0 - RS. 1000 → No discount\n" + 
                        "RS. 1001 - RS. 5000 → 10% discount\n" + 
                        "RS. 5001 - RS. 10000 → 20% discount\n" + 
                        "Above RS. 10000 → 30% discount\n"  );
        

        System.out.println("How much Amount do you want to Shopping!");
        int amount = sc.nextInt();

        if(amount <= 1000){
            System.out.println("OOps You didn't get Discount");
        }else if(amount <= 5000){
            System.out.println("Congratulations You Have Got 10% Dis & Saved," + (float)(amount / 100) * 10);
        }else if(amount <= 10000){
            System.out.println("Congratulations You Have Got 20% Dis & Saved," + (float)(amount / 100) * 20);
        }else{
            System.out.println("Congratulations You Have Got 20% Dis & Saved," + (float)(amount / 100) * 30);
        }


        sc.close();
    }
}

package phase4;

// import java.util.Math;

//32- Check if the number is Prime or not.

class Ques32 {
    public static void main(String[] args) {
        int num = 11;
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
             if(num % i == 0){
                isPrime = false;
                break;
             }
        }

        System.out.println("Number " + num + " is " + isPrime);

    }
}

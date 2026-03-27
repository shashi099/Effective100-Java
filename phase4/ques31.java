package phase4;

class ques31
{
    //31- Print the sum of all factors of a number, 50 -> 1 + 2 + 5 + 10 + 25 = 43

    public static void main(String[] args)
    {
        int n = 50;
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0){
                if(i == n/2){
                    System.out.print(i );
                }else{
                    System.out.print(i + " + ");
                }
                sum += i;
            }
        }

        System.out.println(" = " + sum);

    }
}
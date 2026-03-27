package phase6;

public class Ques51 {
    // 51- Triangle
	//     *
	//    * *
	//   * * *
	//  * * * *
	// * * * * *
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j < n - i -1){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}

package phase6;

public class Ques52
{
    public static void main(String[] a)
    {
        // 52- V - Min Height = 3
	// *       * 
	//  *     *  
	//   *   *   
	//    * *    
    //     * 

    int n = 5;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            if ( j < i){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }   
 
        for (int j = n-1; j > i; j--) {
            if(j > i+1){
                System.out.print("  ");
            }else{
                System.out.print(" *");
            }
        }

        System.out.println();
    }

    }
}
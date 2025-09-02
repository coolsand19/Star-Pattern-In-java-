/*
    Draw the following pattern
    ****
    ***
    **
    *
*/
package StarPattern;

public class Pattern03 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for(int i = 1; i <= n; i++) {
            for(int j=1; j<=n-i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }   
    }
}
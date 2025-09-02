package StarPattern;

public class Pattern01 {
    public static void main(String[] args) {
        // Your code here
        int n = 5; // Number of rows
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
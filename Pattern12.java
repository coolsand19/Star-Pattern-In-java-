package StarPattern;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print first star
            System.out.print("*");
            // Print spaces between stars
            int spaceBetween = 2 * (n - i);
            if (spaceBetween > 0) {
                for (int j = 1; j <= spaceBetween; j++) {
                    System.out.print(" ");
                }
                // Print second star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

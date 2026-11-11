import java.util.Scanner;

public class fixTriangle30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        // Triangle
        int i = 1;                       // fix: start from 1, not 0
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();        // fix: move to a new line after each row
            i++;
        }

        // Inverted triangle
        i = n;                           // no "int", because i is already declared
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}
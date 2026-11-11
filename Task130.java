import java.util.Scanner;

public class Task130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int totalNumbers = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalNumbers++;
            }
            System.out.println();
        }

        System.out.println("Total numbers printed: " + totalNumbers);
        sc.close();
    }
}
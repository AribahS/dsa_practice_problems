package Patterns;
/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/
import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i -1; j++) {
                System.out.print(" ");
            }
            char num = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <=2 * i + 1; j++) {
                System.out.print(num);
                if (j <= breakpoint) num++;
                else num--;
            }
            for (int j = 0; j < n - i -1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    sc.close();
   }
}

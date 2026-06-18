package Patterns;
/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/
import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int n = sc.nextInt();
    int spaces = 2*n - 2;
    for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            spaces -= 2;
            System.out.println();
        }
    spaces=2;
    for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }

    sc.close();
   }
}

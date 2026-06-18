package Patterns;
/*
E 
D E 
C D E 
B C D E 
A B C D E
*/
import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
             for (char ch = (char) ('A' + n - 1 - i); ch <= (char) ('A' + n - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    sc.close();
   }
}

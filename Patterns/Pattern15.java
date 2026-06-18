package Patterns;
/*
ABCDE
ABCD
ABC
AB
A
*/
import java.util.Scanner;

public class Pattern15 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int n = sc.nextInt();
     for (int i = n; i > 0; i--) {
                char num = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(num);
                    num++;
                }
                System.out.println();
        }

    sc.close();
   }
}

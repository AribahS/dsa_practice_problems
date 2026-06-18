package Patterns;
/*
A
BB
CCC
DDDD
EEEEE
*/
import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int n = sc.nextInt();
    char num ='A';
    for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(num);
            }
            num++;
            System.out.println();
        }

    sc.close();
   }
}

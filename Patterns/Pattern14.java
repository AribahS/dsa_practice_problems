package Patterns;
/*
A
AB
ABC
ABCD
ABCDE
*/

import java.util.Scanner;

public class Pattern14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        char num='A';
        for(int j=1;j<=i;j++){
            System.out.print(num);
            num++;
            System.out.print(" ");
        }
        System.out.println();
    }
    sc.close();
   }
}

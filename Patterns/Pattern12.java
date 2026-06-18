package Patterns;

import java.util.Scanner;

/*
1        1
12      21
123    321
1234  4321
1234554321
*/
public class Pattern12 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int n = sc.nextInt();
    int spaces=2*(n-1);
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        spaces-=2;
        System.out.println();
    }
    sc.close();
   }
}

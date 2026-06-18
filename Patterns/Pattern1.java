package Patterns;

/*
Given an integer n. You need to recreate the pattern given below for any value of N.

*****
*****
*****
*****
*****

*/

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
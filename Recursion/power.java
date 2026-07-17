package Recursion;
/*
50. Pow(x, n)
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
*/
public class power {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            return 1.0/power(x,-N);
        }
        return power(x,N);
    }
    private double power(double x, long n){
        if(n==0) return 1;
        if(n==1) return x;
        if(n%2==0){
            return power(x*x,n/2);
        }
        return x*power(x,n-1);
}
}

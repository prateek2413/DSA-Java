class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if (n < 0) {
            return myPow(1.0 / (x * x), -(n / 2)) * (n % 2 == 0 ? 1.0 : 1.0 / x);
        }
        double half=myPow(x,n/2);
        if(n%2==0){
            return half*half;
        }else{
            return x*half*half;
        }
    }
}

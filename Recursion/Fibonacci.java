class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}

//better solution for large value of n by creating a memory space to store result of already calculated n
class Solution {
    public int fib(int n) {
        return fib(n, new HashMap<>());    
    }

    private int fib(int n, HashMap<Integer, Integer> memo) {
        if(n<=1){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result= fib(n-1,memo)+fib(n-2,memo);
        memo.put(n,result);
        return result;
    }
}

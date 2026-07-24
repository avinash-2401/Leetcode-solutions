class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        
        int first =0;
        int sec =1;
        int sum=first+sec;

        for(int i=2; i<=n;i++){
           sum = first+sec;
           first=sec;
           sec=sum;

        }
        return sum;
        
    }
}
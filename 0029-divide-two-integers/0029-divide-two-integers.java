class Solution {
    public int divide(int dividend, int divisor) {
    
    long answer;

     if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
    
    return dividend/divisor;

        
    }
}
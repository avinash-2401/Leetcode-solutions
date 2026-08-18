class Solution {
    public int mySqrt(int x) {

        int st=1; int end=x; int answer=1;

        if(x==0) return 0;

        while(st<=end){
            int mid = st+(end-st)/2;

            if(((long) mid*mid) <= x){
                answer=mid;
                st=mid+1;
            }
            else end=mid-1;
        }
        return answer;
        
    }
}
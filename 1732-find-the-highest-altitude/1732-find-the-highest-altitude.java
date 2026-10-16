class Solution {
    public int largestAltitude(int[] gain) {
        int answer=0; int max=0;

        for(int i=0; i<gain.length; i++){
            max += gain[i];

            answer= Math.max(answer,max);
            
        } 

        return answer;
    }
}
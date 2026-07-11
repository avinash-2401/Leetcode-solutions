class Solution {
int curr=0; int answer=0; int low=0;

    boolean isVowels(char ch){
            if(ch=='a' || ch=='e'||ch=='i' || ch=='o'||ch=='u'){
                return true;
            }
            return false;
    }
         
    public int maxVowels(String s, int k) {

        for(int i=0;i<k;i++){
            if(isVowels(s.charAt(i))){
                curr++;
            }
            answer=curr;
        }
        for(int i=k ; i<s.length();i++){
             if(isVowels(s.charAt(i))) curr++;
             if(isVowels(s.charAt(i-k))){
                 curr--;
             
             }
             answer = Math.max(answer,curr);

}
            return answer;
    }
}

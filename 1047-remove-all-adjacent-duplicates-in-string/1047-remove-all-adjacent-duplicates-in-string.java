class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!st.isEmpty() && st.peek()==ch ){
                st.pop();

            }
            else {
                st.push(ch);
            }
        }
        StringBuilder answer = new StringBuilder();

        while(!st.isEmpty()){
            answer.append(st.peek());
            st.pop();

        }
        return answer.reverse().toString();
        
    }
}
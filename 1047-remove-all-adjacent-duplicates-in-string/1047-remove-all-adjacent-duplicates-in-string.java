class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder answer = new StringBuilder();
       // answer= "";

        for(int i=0; i<s.length();i++){

        char ch = s.charAt(i);
           if(!st.isEmpty() && st.peek() == s.charAt(i)){
            st.pop();
           }
           else st.push(ch);

    }
    while(!st.isEmpty()){
        answer = answer.append(st.pop());
    }
    return answer.reverse().toString();
}
}

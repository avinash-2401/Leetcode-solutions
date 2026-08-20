class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                   st.pop();
            }
             else if (operations[i].equals("D")) {
                st.push(st.peek() * 2);
            } 
            else if (operations[i].equals("+")) {
                 int top = st.pop();
                int newScore = top + st.peek();
                 st.push(top);             // Put the first top back
             st.push(newScore);         // Push the new combined score
            }
             else {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        
        // Calculate the total sum of all points in the stack
        int totalSum = 0;
        for (int score : st) {
            totalSum += score;
        }
        
        return totalSum;
    }
}
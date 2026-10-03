class Solution {
    public int calPoints(String[] operations) {

        Stack<String> st = new Stack<>();
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            String ch = operations[i];

            if (ch.equals("+")) {
                String val = st.pop();
                int topToAdd = Integer.parseInt(val) + Integer.parseInt(st.peek());
                st.push(val);
                st.push(String.valueOf(topToAdd));
            } else if (ch.equals("D")) {
                st.push(String.valueOf(2 * (Integer.parseInt(st.peek()))));
            } else if (ch.equals("C")) {
                st.pop();
            } else {
                st.push(ch);
            }

            

        }
        while (st.size() > 0) {
                sum = sum + Integer.parseInt(st.pop());
            }
        return sum;
    }
}
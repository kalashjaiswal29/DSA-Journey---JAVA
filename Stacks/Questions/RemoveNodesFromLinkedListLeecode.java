/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp2 = null;

        ListNode temp = head;
        while (temp != null) {
            if(st.size() == 0) st.push(temp) ;
            else if (st.peek().val >= temp.val) {
                st.push(temp);
            } else {
                while ( st.size() > 0 && st.peek().val < temp.val) {
                    st.pop();
                }
                st.push(temp);
            }

            temp = temp.next;

        }
        temp2 = st.pop();
        while (st.size() > 0) {
            ListNode temp1 = st.pop();
            temp1.next = temp2;
            temp2 = temp1;
      
        }
        return temp2;
    }
}
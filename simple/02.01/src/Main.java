public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        ListNode head = new ListNode(0);
        System.out.println(solution.removeDuplicateNodes(head));
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode start = head;
        while (start != null) {
            ListNode result = start;
            while (result.next != null) {
                if (result.next.val == start.val) {
                    result.next = result.next.next;
                } else {
                    result = result.next;
                }
            }
            start = start.next;
        }
        return head;
    }
}

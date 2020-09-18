public class Main {
    public static void main(String[] args)
    {

    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder result = new StringBuilder();
        while (head != null)
        {
            result.append(head.val);
            head = head.next;
        }
        return Integer.valueOf(result.toString(), 2);
    }
}
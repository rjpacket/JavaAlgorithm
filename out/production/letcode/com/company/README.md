```
    public class ListNode {
        public int val;
        public ListNode next;
    
        public ListNode(int x) {
            val = x;
        }
    
    }

    public static boolean isPalindromee(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            head.next = pre;
            pre = head;
            head = slow;
        }

        if(fast != null){
            slow = slow.next;
        }

        while (slow != null && pre != null) {
            if (slow.val != pre.val) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }

        return true;
    }
```
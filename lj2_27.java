import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class l27 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head = head.next;
        }
        List<Integer> b = new ArrayList<>(a);
        Collections.reverse(a);
        return a.equals(b);
    }
}

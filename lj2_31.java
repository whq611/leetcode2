import java.util.HashMap;

class ListNode{
    int key;
    int val;
    ListNode next = null;
    ListNode prev = null;
    public ListNode(){}
    public ListNode(int key, int val){
        this.key = key;
        this.val = val;
    }
}

public class lj2_31 {
    int capacity;
    HashMap<Integer, ListNode> sites = new HashMap<>();
    ListNode head = new ListNode();
    ListNode tail = new ListNode();

    public lj2_31(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public void move_to_tail(int key){
        ListNode node = sites.get(key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
    }

    public int get(int key) {
        if(sites.containsKey(key)){
            move_to_tail(key);
            return sites.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(sites.containsKey(key)){
            sites.get(key).val = value;
            move_to_tail(key);
        }else{
            if(sites.size()==capacity){
                sites.remove(head.next.key);
                head.next = head.next.next;
                head.next.prev = head;
            }
            ListNode node = new ListNode(key,value);
            sites.put(key,node);
            node.prev = tail.prev;
            node.next = tail;
            tail.prev.next = node;
            tail.prev = node;
        }
    }
}

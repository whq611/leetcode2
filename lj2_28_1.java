import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

public class lj2_28_1 {
    public Node flatten(Node head) {
        List<Node> a = new ArrayList<>();
        LinkedList<Node> b = new LinkedList<>();
        b.add(head);
        Node cur = null;
        while(cur!=null || !b.isEmpty()){
            if(cur!=null){
                a.add(cur);
                b.add(cur.next);
                cur = cur.child;
            }
            else{
                cur = b.removeLast();
            }
        }
        for(int i=0; i<a.size()-1; i++){
            a.get(i).next = a.get(i+1);
            a.get(i+1).prev = a.get(i);
            a.get(i).child = null;

        }
        return head;
    }
}

import java.util.ArrayList;

import java.util.List;
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
public class lj2_28 {
    public Node flatten(Node head) {
        List<Node> a = new ArrayList<>();
        dfs(head,a);
        for(int i=0; i<a.size()-1; i++){
            a.get(i).next = a.get(i+1);
            a.get(i+1).prev = a.get(i);
            a.get(i).child = null;

        }
        return head;
    }

    public void dfs(Node head, List<Node> a){
        if(head==null) return;
        a.add(head);
        dfs(head.child,a);
        dfs(head.next,a);
    }
}

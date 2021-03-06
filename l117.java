import java.util.LinkedList;
import java.util.Queue;
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class l117 {
    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> Q = new LinkedList<Node>();
        Q.offer(root);
        while(!Q.isEmpty()){
            int size = Q.size();
            for(int i=0; i<size; i++){
                Node node = Q.poll();
                if(i<size-1) node.next = Q.peek();
                if(node.left!=null) Q.offer(node.left);
                if(node.right!=null) Q.offer(node.right);
            }
        }
        return root;
    }
}

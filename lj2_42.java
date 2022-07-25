import java.util.Deque;
import java.util.LinkedList;

public class lj2_42 {
    Deque<Integer> q;

    public lj2_42() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        while(!q.isEmpty() && q.peek()<t-3000) q.poll();
        q.offer(t);
        return q.size();
    }
}

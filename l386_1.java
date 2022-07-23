import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
public class l386_1 {
    public List<Integer> lexicalOrder(int n) {
        

        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> a = new PriorityQueue<>((x,y) -> String.valueOf(x).compareTo(String.valueOf(y)));
        for(int i=1; i<=n; i++){
            a.offer(i);
        }
        while(!a.isEmpty()){
            res.add(a.poll());
        }
        return res;

    }
}

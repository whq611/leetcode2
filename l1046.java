import java.util.Collections;
import java.util.LinkedList;

public class l1046 {
    public int lastStoneWeight(int[] stones) {
        int a = 0, b = 0;
        LinkedList<Integer> t = new LinkedList<>();
        for(int i: stones){
            t.add(i);
        }
        while(t.size()>1){
            a = Collections.max(t);
            t.remove(t.indexOf(a));
            b = Collections.max(t);
            t.remove(t.indexOf(b));
            if(a!=b) t.add(a-b);
        }
        if(!t.isEmpty()) return t.get(0);
        return 0;
    }
}

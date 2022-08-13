import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
public class l692_1 {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> count = new HashMap<>();
        for(String num: words){
            count.put(num, count.getOrDefault(num,0)+1);
        }

        List<String> arr = new ArrayList<>();
        PriorityQueue<String> heap = new PriorityQueue<>((x,y)->{if(count.get(x)==count.get(y)) return y.compareTo(x); else return count.get(x) - count.get(y);});
        for(String num: count.keySet()){
            heap.offer(num);
            if(heap.size()>k) heap.poll();
        }
        while(!heap.isEmpty()) arr.add(heap.poll());
        Collections.reverse(arr);
        return arr;

    }
}

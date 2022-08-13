import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class l692_3 {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> count = new HashMap<>();
        for(String num: words){
            count.put(num, count.getOrDefault(num,0)+1);
        }

        List<String> arr = new ArrayList<>();
        for(String num: count.keySet()){
            arr.add(num);
        }
        Collections.sort(arr, (x,y) -> {
                if(count.get(y) == count.get(x)) return x.compareTo(y);
                else return count.get(y) - count.get(x);
            }
        );
        return arr.subList(0,k);


    }
}

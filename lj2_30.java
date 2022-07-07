import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Map;
import java.util.List;
public class lj2_30 {
    /** Initialize your data structure here. */
    Map<Integer, Integer> dict;
    List<Integer> list;
    Random rd = new Random();
    
    public lj2_30() {
        dict = new HashMap<>();
        list = new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(dict.containsKey(val)) return false;
        dict.put(val,list.size());
        list.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!dict.containsKey(val)) return false;
        int idx = dict.get(val), last = list.get(list.size()-1);
        list.set(idx,last);
        dict.put(last,idx);
        list.remove(list.size()-1);
        dict.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rd.nextInt(list.size()));
    }
}

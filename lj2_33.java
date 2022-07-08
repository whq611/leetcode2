import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class lj2_33 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> a = new HashMap<>();
        for(String s: strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!a.containsKey(key)){
                a.put(key,res.size());
                res.add(new ArrayList<>());
            }
            
            res.get(a.get(key)).add(s);
        }
        return res;
    }
}

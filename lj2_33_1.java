import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class lj2_33_1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> a = new HashMap<>();
        for(String s: strs){
            int[] count = new int[26];
            
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!a.containsKey(key)){
                a.put(key,res.size());
                res.add(new ArrayList<>());
            }
            
            res.get(a.get(key)).add(s);
        }
        return res;
    }
}

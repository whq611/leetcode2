import java.util.HashMap;

public class l424_1 {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> dic = new HashMap<>();
        int res = 0, l = 0, r = 0, cur_max = 0, n = s.length();
        while(r<n){
            dic.put(s.charAt(r), dic.getOrDefault(s.charAt(r), 0)+1);
            cur_max = Math.max(cur_max, dic.get(s.charAt(r)));
            while(r-l+1 > cur_max+k){
                dic.put(s.charAt(l), dic.get(s.charAt(l))-1);
                l += 1;
            }
            res = Math.max(res, r-l+1);
            r += 1;
        }
        return res;
    }
}

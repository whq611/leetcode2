import java.util.HashMap;

public class l974_1 {
    public int subarraysDivByK(int[] nums, int k) {
        int res = 0, prefix = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(0,1);
        for(int a: nums){
            prefix = ((prefix + a) % k + k) % k;
            int b = count.getOrDefault(prefix, 0);
            res += b;
            count.put(prefix, b + 1);
        }
        return res;
    }
}

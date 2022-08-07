public class l974 {
    public int subarraysDivByK(int[] nums, int k) {
        int res = 0, prefix = 0;
        int[] count = new int[k];
        count[0] = 1;
        for(int a: nums){
            prefix = ((prefix + a) % k + k) % k;
            res += count[prefix];
            count[prefix] += 1;
        }
        return res;
    }
}

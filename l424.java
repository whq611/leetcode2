public class l424 {
    public int characterReplacement(String s, int k) {
        int[] num = new int[26];
        int res = 0, l = 0, r = 0, cur_max = 0, n = s.length();
        while(r<n){
            num[s.charAt(r) - 'A'] += 1;
            cur_max = Math.max(cur_max, num[s.charAt(r) - 'A']);
            while(r-l+1 > cur_max+k){
                num[s.charAt(l) - 'A'] -= 1;
                l += 1;
            }
            res = Math.max(res, r-l+1);
            r += 1;
        }
        return res;
    }
}

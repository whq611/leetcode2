import java.util.Arrays;

public class lj2_32_1 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length() || s.equals(t)) return false;
        int[] a = new int[26];
        int[] b = new int[26];
        for(char i: s.toCharArray()){
            a[i - 'a'] += 1;
        }
        for(char j: t.toCharArray()){
            b[j - 'a'] += 1;
        }
        return Arrays.equals(a,b);
    }
}

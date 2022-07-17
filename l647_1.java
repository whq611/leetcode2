public class l647_1 {
    public int countSubstrings(String s) {
        int n = s.length(), res = 0, a = 2*n-1;
        for(int i = 0; i<a; i++){
            int b = i/2, c = i/2+i%2;
            while(b>=0 && c<n && s.charAt(b)==s.charAt(c)){
                res++;
                b--;
                c++;
            }
        }
        return res;
    }
}

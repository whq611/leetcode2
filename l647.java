public class l647 {
    public int countSubstrings(String s) {
        int n = s.length(), res = 0;
        int[][] a = new int[n][n];
        for(int i=0; i<n; i++){
            a[i][i] = 1;
            res++;
        }
        for(int i=n-2; i>=0; i--){
            for(int j=i+1; j<n; j++){
                if(s.charAt(i)==s.charAt(j) && (i==j-1 || a[i+1][j-1]==1)){
                    a[i][j] = 1;
                    res++;
                }
            }
        }
        return res;
    }
}

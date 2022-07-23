public class l502 {
    int res = 0;
    int[] a;
    int[] profits;
    int[] capital;
    int k;
    int l;
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        this.k = k;
        this.profits = profits;
        this.capital = capital;
        int l = profits.length;
        this.l = l;
        this.a = new int[l];
        for(int i=0; i<l; i++){
            if(capital[i]<=w) dfs(i,w,1);
        }
        return res;
    }
    public void dfs(int i, int tmp, int n){
        a[i] = 1;
        tmp+=profits[i];
        if(n==k) res = Math.max(res,tmp);
        else{
            int b = 0;
            for(int j=0; j<l; j++){
                if(tmp>=capital[j] && a[j]==0){
                    b++;
                    dfs(j,tmp,n+1);
                }
            }
            if(b==0) res = Math.max(res,tmp);
        }
        a[i] = 0;
    }
}

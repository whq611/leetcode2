import java.util.ArrayList;
import java.util.List;

public class l386_3 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for(int i=1; i<10; i++){
            dfs(i,n);
        }
        return res;

    }
    public void dfs(int i, int n){
        if(i<=n){
            res.add(i);
            for(int j=0; j<10; j++){
                dfs(i*10+j,n);
            }
        }
    }
}

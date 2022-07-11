import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class l797 {
    LinkedList<Integer> cur = new LinkedList<>();
    
    List<List<Integer>> res = new ArrayList<>();
    int n;
    int[][] graph;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        n = graph.length;
        cur.add(0);
        for(int i: graph[0]){
            dfs(i);
        }
        return res;
    }
    public void dfs(int i){
        cur.add(i);
        if(i==n-1){
            res.add(new ArrayList<>(cur));
            cur.removeLast();
            return;
        }
        for(int j: graph[i]){
            dfs(j);
        }
        cur.removeLast();
    }
}

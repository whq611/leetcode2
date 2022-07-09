import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class l1091_1 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        Deque<int[]> que = new LinkedList<>();
        que.offer(new int[]{0,0});
        Set<int[]> visited = new HashSet<>();
        int res = 1;
        while(!que.isEmpty()){
            int b = que.size();
            for(int a=0; a<b;a++){
                int[] poll = que.poll();
                int i = poll[0], j = poll[1];
                if(i==n-1 && j==n-1 && !visited.contains(poll) && grid[i][j]==0) return res;
                if(i<0 || j<0 || i>=n || j>=n || grid[i][j]==1 || visited.contains(poll)) continue;
                visited.add(poll);
                
                
                que.offer(new int[]{i-1,j});
                que.offer(new int[]{i,j-1});
                que.offer(new int[]{i-1,j-1});
                que.offer(new int[]{i-1,j+1});
                que.offer(new int[]{i+1,j-1});
                que.offer(new int[]{i+1,j});
                que.offer(new int[]{i,j+1});
                que.offer(new int[]{i+1,j+1});
            }
            
            res++;
        }
        return -1;
    }
}

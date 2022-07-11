import java.util.LinkedList;

public class l130_1 {
    int m;
    int n;
    public void solve(char[][] board) {
        this.m = board.length;
        this.n = board[0].length;
        for(int i=0; i<m; i++){
            bfs(board,i,0);
            bfs(board,i,n-1);
        }
        for(int j=0; j<n; j++){
            bfs(board,0,j);
            bfs(board,m-1,j);
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='-') board[i][j]='O';
            }
        }
    }
    public void bfs(char[][] board, int i, int j){
        LinkedList<int[]> a = new LinkedList<>();
        a.add(new int[]{i,j});
        while(!a.isEmpty()){
            int[] poll = a.remove();
            i = poll[0];
            j = poll[1];
            if(i<0 || i>=m || j<0 || j>=n || board[i][j]=='X' || board[i][j]=='-') continue;
            board[i][j]='-';
            a.add(new int[]{i-1,j});
            a.add(new int[]{i+1,j});
            a.add(new int[]{i,j-1});
            a.add(new int[]{i,j+1});
        }
        
    }
}

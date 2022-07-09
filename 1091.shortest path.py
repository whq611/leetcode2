class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:
        
        def dfs(i,j,tmp):
            if i==n-1 and j==n-1 and grid[i][j]==0:
                tmp+=1
                self.res = min(self.res,tmp)
            if i<0 or j<0 or i>=n or j>=n or grid[i][j]==1: return
            grid[i][j]=1
            dfs(i-1,j,tmp+1)
            dfs(i,j-1,tmp+1)
            dfs(i-1,j-1,tmp+1)
            dfs(i-1,j+1,tmp+1)
            dfs(i+1,j-1,tmp+1)
            dfs(i+1,j,tmp+1)
            dfs(i,j+1,tmp+1)
            dfs(i+1,j+1,tmp+1)
            grid[i][j]=0
        
        
        n = len(grid)
        if grid[0][0]==1 or grid[n-1][n-1]==1: return -1
        self.res = n*n+1
        dfs(0,0,0)
        if self.res==n*n+1: return -1
        return self.res

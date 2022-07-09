class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:
        n = len(grid)
        if grid[0][0]==1 or grid[n-1][n-1]==1: return -1
        
        que = collections.deque([(0,0)])
        visited = set()
        res = 1
        while que:
            for _ in range(len(que)):
                i,j = que.popleft()
                if i==n-1 and j==n-1 and (i,j) not in visited and grid[i][j]==0:
                    return res
                if i<0 or j<0 or i>=n or j>=n or grid[i][j]==1 or (i,j) in visited:
                    continue
                visited.add((i,j))
                que.append((i-1,j))
                que.append((i,j-1))
                que.append((i-1,j-1))
                que.append((i-1,j+1))
                que.append((i,j+1))
                que.append((i+1,j))
                que.append((i+1,j-1))
                que.append((i+1,j+1))
            res+=1
        return -1

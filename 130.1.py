class Solution:
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        def bfs(i,j):
            a = collections.deque([(i,j)])
            while a:
                i,j = a.popleft()
                if i<0 or i>=m or j<0 or j>=n or board[i][j]=="X" or board[i][j]=="-": continue
                board[i][j]="-"
                a.extend([(i-1,j), (i+1,j), (i,j-1), (i,j+1)])
            



        m,n = len(board),len(board[0])
        for i in range(m):
            bfs(i,0)
            bfs(i,n-1)
        for j in range(n):
            bfs(0,j)
            bfs(m-1,j)
        for i in range(m):
            for j in range(n):
                if board[i][j]=="O": board[i][j]="X"
                elif board[i][j]=="-": board[i][j]="O"

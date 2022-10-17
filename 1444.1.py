class Solution:
    def ways(self, pizza: List[str], k: int) -> int:
        r, c = len(pizza), len(pizza[0])
        prefix = [[0]* (c+1) for _ in range(r+1)]
        for i in range(r):
            for j in range(c):
                prefix[i+1][j+1] = prefix[i][j+1] + prefix[i+1][j] - prefix[i][j] + (1 if pizza[i][j] == 'A' else 0)
        @lru_cache(None)
        def f(x, y, k):
            if not k:
                return prefix[r][c] - prefix[x][c] - prefix[r][y] + prefix[x][y] > 0
            res = 0
            for i in range(x+1, r):
                if prefix[i][c] - prefix[x][c] - prefix[i][y] + prefix[x][y] > 0:
                    res += f(i, y, k-1)
            for j in range(y+1, c):
                if prefix[r][j] - prefix[x][j] - prefix[r][y] + prefix[x][y] > 0:
                    res += f(x, j, k-1)
            return res
        return f(0, 0, k-1) % (10**9+7)

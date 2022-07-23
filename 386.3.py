class Solution:
    def lexicalOrder(self, n: int) -> List[int]:
        def dfs(i):
            if i<=n:
                res.append(i)
                for j in range(10):
                    dfs(10*i+j)

        res = []
        for i in range(1,10):
            dfs(i)
        return res

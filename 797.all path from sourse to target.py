class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        def dfs(i):
            
            
            cur.append(i)
            if i==n-1:
                res.append(cur[:])
                cur.pop()
                return
            for j in graph[i]:
                dfs(j)
            cur.pop()


        
        
        n = len(graph)
        res = []
        cur = [0]
        for i in graph[0]:
            dfs(i)
        return res

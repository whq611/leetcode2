class Solution:
    def findMaximizedCapital(self, k: int, w: int, profits: List[int], capital: List[int]) -> int:

        def dfs(i,tmp,n):
            nonlocal res
            a[i] = 1
            tmp+=profits[i]
            if n==k:
                res = max(res,tmp)
            else:
                b = 0
                for j in range(len(capital)):
                    if tmp>=capital[j] and a[j]==0:
                        b+=1
                        dfs(j,tmp,n+1)
                if b==0:
                    res = max(res,tmp)
            a[i] = 0


        res = 0
        a = [0]*len(profits)
        for i in range(len(capital)):
            if capital[i]<=w:
                dfs(i,w,1)
        return res

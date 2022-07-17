class Solution:
    def countSubstrings(self, s: str) -> int:
        n = len(s)
        res = 0
        a = [[0] * n for _ in range(n)]
        for i in range(n):
            a[i][i] = 1
            res+=1
        for i in range(n-2,-1,-1):
            for j in range(i+1,n):
                if s[i]==s[j] and (i==j-1 or a[i+1][j-1]==1):
                    a[i][j] = 1
                    res+=1
        return res

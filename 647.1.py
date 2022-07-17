class Solution:
    def countSubstrings(self, s: str) -> int:
        res = 0
        n = len(s)
        a = 2*n-1
        for i in range(a):
            b = i//2
            c = i//2 + i%2
            while b>=0 and c<n and s[b]==s[c]:
                res+=1
                b-=1
                c+=1
        return res

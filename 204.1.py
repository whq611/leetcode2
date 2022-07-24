class Solution:
    def countPrimes(self, n: int) -> int:
        a = [1] * n
        res = 0
        for i in range(2,n):
            if a[i]==1:
                res+=1
                if i*i<n:
                    for j in range(i*i,n,i):
                        a[j] = 0
        return res

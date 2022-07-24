class Solution:
    def countPrimes(self, n: int) -> int:
        def isPrime(x):
            for i in range(2,int(x**0.5)+1):
                if x%i==0: return False
            return True

        res = 0
        for i in range(2,n):
            if isPrime(i):
                res+=1
        return res

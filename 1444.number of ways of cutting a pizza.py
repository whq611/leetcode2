class Solution:
    def ways(self, pizza: List[str], k: int) -> int:
        r,c=len(pizza),len(pizza[0])
        @functools.lru_cache(None)
        def f(x,y,k):
            if not k:
                return any('A' in p[y:c] for p in pizza[x:r])
            res=0
            for i in range(x+1,r):
                if any('A' in p[y:c] for p in pizza[x:i]):
                    res+=f(i,y,k-1)
            for j in range(y+1,c):
                if any('A' in p[y:j] for p in pizza[x:r]):
                    res+=f(x,j,k-1)
            return res
        return f(0,0,k-1)%1000000007

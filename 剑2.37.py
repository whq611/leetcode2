class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        res = []
        for i in asteroids:
            if not res or i>0 or res[-1]<0:
                res.append(i)
            else:
                while res and -i>res[-1]>0:
                    res.pop()
                if res and res[-1]==-i:
                    res.pop()
                    continue
                if not res or res[-1]<0: res.append(i)
        return res

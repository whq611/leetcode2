class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        res = []
        i=0
        while i < len(asteroids):
            if not res or asteroids[i]>0 or res[-1]<0:
                res.append(asteroids[i])
            elif res[-1]<-asteroids[i]:
                res.pop()
                continue
            elif res[-1]==-asteroids[i]:
                res.pop()
                
            i+=1

                
        return res

class RecentCounter:

    def __init__(self):
        self.sum = 0
        self.q = collections.deque()


    def ping(self, t: int) -> int:
        while self.q and self.q[0]<t-3000:
            self.q.popleft()
            self.sum-=1
        self.sum+=1
        self.q.append(t)
        return self.sum

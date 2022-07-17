class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        a = []
        for s in stones:
            heapq.heappush(a,-s)
        while len(a)>1:
            b = heapq.heappop(a)
            c = heapq.heappop(a)
            if b<c: heapq.heappush(a,b-c)
        if not a: return 0
        return -a[0]

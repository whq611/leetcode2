class Solution:
    def lexicalOrder(self, n: int) -> List[int]:
        res = []
        a = [str(i) for i in range(1,n+1)]
        heapq.heapify(a)
        while a:
            res.append(int(heapq.heappop(a)))
        return res

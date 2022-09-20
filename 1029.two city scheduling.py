class Solution:
    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        res = 0
        l, r = 0, 0
        heap1 = []
        heap2 = []
        for i in costs:
            if i[0] <= i[1]:
                l += 1
                res += i[0]
                heapq.heappush(heap1, i[1] - i[0])
            else:
                r += 1
                res += i[1]
                heapq.heappush(heap2, i[0] - i[1])
        while l < r:
            res += heapq.heappop(heap2)
            l += 1
            r -= 1
        while l > r:
            res += heapq.heappop(heap1)
            l -= 1
            r += 1
        return res

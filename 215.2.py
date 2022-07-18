class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:

        a = []
        for num in nums:
            heapq.heappush(a,num)
            if len(a)>k: heapq.heappop(a)
        return a[0]

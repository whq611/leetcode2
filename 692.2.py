class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        count = collections.Counter(words)
        res = []
        ans = []
        for key,val in count.items():
            heapq.heappush(res,(-val,key))
        while len(ans) < k:
            ans.append(heapq.heappop(res)[1])
        
        
        return ans

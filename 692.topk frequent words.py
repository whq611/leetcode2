class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        d = collections.Counter(words)
        return heapq.nsmallest(k, d, key=lambda x: (-d[x], x))

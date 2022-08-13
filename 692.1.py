class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        d = collections.Counter(words)
        ans = d.keys()
        return sorted(ans, key = lambda x: (-d[x], x))[:k]

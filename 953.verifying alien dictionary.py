class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        dic = {}
        for i in range(len(order)):
            dic[order[i]] = i
        a = list(sorted(words, key = lambda x: [dic[i] for i in x]))
        return a == words

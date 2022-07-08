class Solution:
    def longestWord(self, words: List[str]) -> str:
        words.sort()
        a = set()
        res = ''
        for word in words:
            if len(word)==1 or word[:-1] in a:
                if len(word)>len(res): res = word
                a.add(word)
        return res

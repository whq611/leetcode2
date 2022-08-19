class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> List[str]:
        wordDict2Set = set(wordDict)
        import collections
        dic = collections.defaultdict(list)
        def backtracking(s):
            if s in dic:
                return dic[s]
            res = []
            if not s:
                return [[]]
            for i in range(len(s)):
                if s[:i+1] in wordDict2Set:
                    cur = backtracking(s[i+1:])
                    for tmp in cur:
                        tmp = [s[:i+1]] + tmp
                        res.append(tmp)
            dic[s] = res
            return res
        return [' '.join(tmp) for tmp in backtracking(s)]

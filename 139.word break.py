class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        n = len(s)
        dp = [False] * (n + 1)
        dp[0] = True
        wordDict = set(wordDict)
        for i in range(n):
            if dp[i]:
                for j in range(i+1,n+1):
                    if s[i:j] in wordDict:
                        dp[j] = True
        return dp[-1]

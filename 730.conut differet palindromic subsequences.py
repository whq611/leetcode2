MOD = int(1e9 + 7)

class Solution:
    def countPalindromicSubsequences(self, s: str) -> int:
        @cache
        def dfs(left: int, right: int) -> int:
            if left >= right:
                return int(left == right)

            res = 0
            for cur in 'abcd':
                i, j = s.find(cur, left, right + 1), s.rfind(cur, left, right + 1)
                if i == -1:
                    continue
                res += 1 if i == j else 2 + dfs(i + 1, j - 1)  
                res %= MOD
            return res

        return dfs(0, len(s) - 1)


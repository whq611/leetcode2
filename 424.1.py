class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        dic = collections.defaultdict(int)
        res = 0
        cur_max = 0
        l = r = 0
        n = len(s)
        while r<n:
            dic[s[r]] += 1
            cur_max = max(cur_max, dic[s[r]])
            while r-l+1 > cur_max+k:
                dic[s[l]] -= 1
                l += 1
            res = max(res, r-l+1)
            r += 1
        return res

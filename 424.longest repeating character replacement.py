class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        nums = [0] * 26
        res = 0
        cur_max = 0
        l = r = 0
        n = len(s)
        while r<n:
            nums[ord(s[r]) - ord('A')] += 1
            cur_max = max(cur_max, nums[ord(s[r]) - ord('A')])
            while r-l+1 > cur_max+k:
                nums[ord(s[l]) - ord('A')] -= 1
                l += 1
            res = max(res, r-l+1)
            r += 1
        return res

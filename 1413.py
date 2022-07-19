class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        res = 0
        tot = 0
        for num in nums:
            tot+=num
            res = min(res,tot)
        return -res+1

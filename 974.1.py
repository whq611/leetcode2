class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        res = 0
        prefix = 0
        count = {0 : 1}
        for a in nums:
            prefix = (prefix + a) % k
            b = count.get(prefix, 0)
            res += b
            count[prefix] = b + 1
        return res

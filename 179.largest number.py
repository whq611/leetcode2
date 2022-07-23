class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        nums.sort(key = functools.cmp_to_key(lambda x, y: -1 if str(x)+str(y)>str(y)+str(x) else 1))
        res = ""
        for i in nums:
            res+=str(i)
        return str(int(res))

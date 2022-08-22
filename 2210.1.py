class Solution:
    def countHillValley(self, nums: List[int]) -> int:
        res = 0
        n = len(nums)
        i = j = 1
        while i < n - 1 and j < n - 1:
            if nums[i-1]<nums[i]>nums[i+1]:# 波峰
                res += 1
                i += 1
                j += 1
            elif nums[i-1]>nums[i]<nums[i+1]:# 波谷
                res += 1
                i += 1
                j += 1
            elif nums[i-1]<nums[i] == nums[i+1]:# 平波峰
                j = i+2
                while j < n and nums[i]==nums[j]:
                    j += 1
                if j < n and nums[i]>nums[j]:
                    res += 1
                i = j
            elif nums[i-1]>nums[i] == nums[i+1]:# 平波谷
                j = i+2
                while j < n and nums[i]==nums[j]:
                    j += 1
                if j < len(nums) and nums[i]<nums[j]:
                    res += 1
                i = j
            else:
                i += 1
                j += 1
        return res

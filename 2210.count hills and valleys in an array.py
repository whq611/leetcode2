class Solution:
    def countHillValley(self, nums: List[int]) -> int:
        res = 0
        for i in range(len(nums) - 1, 0, -1):
            if nums[i] == nums[i-1]:
                nums.pop(i)
        for i in range(1, len(nums) - 1):
            if nums[i] > max(nums[i-1], nums[i+1]) or nums[i] < min(nums[i-1], nums[i+1]):
                res += 1
        return res

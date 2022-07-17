class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack = []
        a = {}
        res = []
        for i in range(len(nums2)):
            while stack and stack[-1]<nums2[i]:
                a[stack.pop()] = nums2[i]
            stack.append(nums2[i])
        for num in nums1:
            res.append(a.get(num, -1))
        return res

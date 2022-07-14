class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        bit = [0]*10001
        for i in range(10001):
            bit[i] = bit[i>>1] + (i&1)
        return sorted(arr, key = lambda x: (bit[x],x))

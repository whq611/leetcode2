class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        for i in range(len(arr)):
            arr[i] += bin(arr[i]).count('1')*100000
        arr.sort()
        for i in range(len(arr)):
            arr[i] %= 100000
        return arr

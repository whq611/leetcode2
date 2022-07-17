class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        first, second = 0,0
        while len(stones)>1:
            first = max(stones)
            stones.remove(first)
            second = max(stones)
            stones.remove(second)
            if first != second:
                stones.append(first-second)
        return stones[0] if stones else 0

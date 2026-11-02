class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        if not piles or h < len(piles): return -1

        l, r = 1, max(piles)

        while l < r:
            k = l + (r - l) // 2
            totalHours = sum((p + k - 1) // k for p in piles)

            if totalHours <= h:
                r = k
            else:
                l = k + 1
        

        return l

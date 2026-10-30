class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r, res = 0, len(heights) - 1, 0

        while l < r:
            res = max(res, min(heights[l], heights[r]) * (r - l))

            if heights[l] < heights[r]:
                l += 1
            else:
                r -= 1
        
        return res
class Solution:
    def trap(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1

        lMax = height[l]
        rMax = height[r]
        res = 0

        while l < r:
            lMax = max(height[l], lMax)
            rMax = max(height[r], rMax)

            if lMax < rMax:
                res += lMax - height[l]
                l += 1
            elif lMax > rMax:
                res += rMax - height[r]
                r -= 1
            else:
                res += lMax - height[l]
                l += 1
        return res
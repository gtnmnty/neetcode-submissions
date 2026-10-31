class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n = len(heights)
        stack = [0] * (n + 2)   # array-based "stack" of indices
        top = 0
        stack[0] = -1

        res = 0
        for i in range(n + 1):
            # Checks if i == n. Assign the val at index i if not
            h = 0 if i == n else heights[i]
            while top > 0 and heights[stack[top]] >= h:
                height = heights[stack[top]]
                top -= 1
                width = i - stack[top] - 1
                res = max(res, height * width)
            top += 1
            stack[top] = i

        return res
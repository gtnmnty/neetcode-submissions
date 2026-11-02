class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix: return False

        rows = len(matrix)
        cols = len(matrix[0])

        l, r = 0, (rows * cols) - 1

        while l <= r:
            mid = l + (r - l) // 2
            num = matrix[mid // cols][mid % cols]

            if num == target:
                return True
            elif num < target:
                l = mid + 1
            elif num > target:
                r = mid - 1
        
        return False
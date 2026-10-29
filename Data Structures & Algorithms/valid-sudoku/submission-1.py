class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:
        rows = [[False] * 9 for _ in range(9)]
        cols = [[False] * 9 for _ in range(9)]
        boxes = [[False] * 9 for _ in range(9)]

        for r in range(9):
            for c in range(9):
                val = board[r][c]
                if val == '.':
                    continue

                digit = ord(val) - ord('1')
                box_idx = (r // 3) * 3 + (c // 3)

                if rows[r][digit] or cols[c][digit] or boxes[box_idx][digit]:
                    return False

                rows[r][digit] = True
                cols[c][digit] = True
                boxes[box_idx][digit] = True

        return True
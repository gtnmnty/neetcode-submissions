class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        freq = [0] * 26

        left = 0
        maxF, maxLen = 0, 0

        for right, ch in enumerate(s):
            freq[ord(ch) - ord('A')] += 1
            maxF = max(maxF, freq[ord(ch) - ord('A')])

            if (right - left + 1) - maxF > k:
                freq[ord(s[left]) - ord('A')] -= 1
                left += 1
            
            maxLen = max(maxLen, right - left + 1)
            
        return maxLen
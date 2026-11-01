class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = set()
        l = best = 0
        for i, char in enumerate(s):
            while char in seen:
                seen.remove(s[l])
                l+=1
            seen.add(char)
            best = max(best, i - l + 1)
        
        return best
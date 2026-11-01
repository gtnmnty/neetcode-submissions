class Solution:
    def minWindow(self, s: str, t: str) -> str:
        # Check if the s or t are empty OR length of S is less than length of t
        if not s or not t or len(s) < len(t): return ""

        # Initialize char array, var like count, start, end, minLen, and startIndex with 0
        mapF = [0] * 128
        count = len(t)
        start, end = 0, 0
        minLen, startIndex = float("inf"), 0

        for char in t:
            mapF[ord(char)] += 1

        while end < len(s):
            if mapF[ord(s[end])] > 0:
                count -= 1
            mapF[ord(s[end])] -= 1
            end+=1

            while count == 0:
                if end - start < minLen:
                    startIndex = start
                    minLen = end - start
                
                if mapF[ord(s[start])] == 0: 
                    count += 1
                mapF[ord(s[start])] += 1
                start += 1
        
        return "" if minLen == float("inf") else s[startIndex : startIndex + minLen]
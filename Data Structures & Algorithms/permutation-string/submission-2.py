class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        s1Len, s2Len = len(s1), len(s2)

        if s1Len > s2Len: return False

        count1 = [0] * 26
        count2 = [0] * 26

        for i in range(s1Len):
            count1[ord(s1[i]) - ord('a')] += 1
            count2[ord(s2[i]) - ord('a')] += 1
        
        if count1 == count2: return True

        for i in range(s1Len, s2Len):
            count2[ord(s2[i]) - ord('a')] += 1
            count2[ord(s2[i - s1Len]) - ord('a')] -= 1

            if count1 == count2:
                return True
        
        return False

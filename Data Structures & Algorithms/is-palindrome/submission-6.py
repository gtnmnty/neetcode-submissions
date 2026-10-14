class Solution:
    def isPalindrome(self, s: str) -> bool:
        start = 0;
        end = len(s) - 1

        while start < end:
            head = s[start]
            tail = s[end]

            if not head.isalnum():
                start += 1
            elif not tail.isalnum():
                end -= 1
            else:
                if head.lower() != tail.lower():
                    return False
                start += 1
                end -= 1

        return True
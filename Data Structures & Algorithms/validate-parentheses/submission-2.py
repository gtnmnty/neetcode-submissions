class Solution:
    def isValid(self, s: str) -> bool:
        stack = deque()
        cTO = { ")" : "(", "]" : "[", "}" : "{" }

        for c in s:
            if c in cTO:
                if stack and stack[-1] == cTO[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)    
    
        return not stack

class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        from collections import deque
        dq = deque()
        output = []

        for i in range(len(nums)):
            # Remove elements outside the window
            while dq and dq[0] <= i - k:
                dq.popleft()

            # Remove elements smaller than current (they're useless)
            while dq and nums[dq[-1]] < nums[i]:
                dq.pop()

            dq.append(i)

            if i >= k - 1:
                output.append(nums[dq[0]])

        return output    
            

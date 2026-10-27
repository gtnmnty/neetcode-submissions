class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # similar to int[] freq = new int[20001] in java
        freq = [0] * 20000

        for num in nums:
            freq[num + 10000] += 1

        result = []

        for i in range(k):
            max_freq = -1
            max_idx = -1
            for i in range(len(freq)):
                if freq[i] > max_freq:
                    max_freq = freq[i]
                    max_idx = i
            
            result.append(max_idx - 10000)
            freq[max_idx] = -1  # mark as used so it won't be picked again

        return result
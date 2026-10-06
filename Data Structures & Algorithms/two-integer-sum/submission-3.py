class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map = dict()

        for i, num in enumerate(nums):
            diff = target - num

            if diff in num_map:
                return [num_map[diff], i]
            num_map[num] = i
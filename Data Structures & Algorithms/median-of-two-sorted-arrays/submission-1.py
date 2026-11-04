from typing import List

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n1 = len(nums1)
        n2 = len(nums2)
        n = n1 + n2

        temp_length = n // 2 + 1
        temp = [0] * temp_length
        i = 0
        j = 0

        for k in range(temp_length):
            if i < n1 and j < n2:
                if nums1[i] < nums2[j]:
                    temp[k] = nums1[i]
                    i += 1
                else:
                    temp[k] = nums2[j]
                    j += 1
            elif i < n1:
                temp[k] = nums1[i]
                i += 1
            else:
                temp[k] = nums2[j]
                j += 1

        t = len(temp)
        if n % 2 == 0:
            return (temp[t-1] + temp[t-2]) / 2.0
        else:
            return float(temp[t-1])

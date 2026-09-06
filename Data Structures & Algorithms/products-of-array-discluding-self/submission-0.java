class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if (n == 0) return new int[0];

        int[] result  =   new int[n];
        int[] left    =   new int[n];
        int[] right   =   new int[n];
        
        left[0] = 1;
        right[n-1] = 1;
        /*
        for(int i = 1; i < n; i++){
            left[i] = nums[i - 1] * left[i - 1];
        }

        for(int i = n - 2; i >= 0; i--){
            right[i] = nums[i + 1] * right[i + 1];
        }

        for(int i = 0; i < n; i++){
            result[i] = left[i] * right[i];
        }
        */

        // Enhance version...
        int left_index = 1;
        for(int num: nums){
            if (left_index < n) {
                left[left_index] = num * left[left_index - 1];
                left_index++;
            }
        }

        int right_index = n - 2;
        for(int num: nums){
            if(right_index >=0){
                right[right_index] = nums[right_index + 1] * right[right_index + 1];
                right_index--;
            }
        }

        int i = 0;
        for(int num: nums){
            result[i] = left[i] * right[i];
            i++;
        }

        return result;
    }
}  

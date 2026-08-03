class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] foundIndex = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    foundIndex[0] = i;
                    foundIndex[1] = j;
                    return foundIndex;
                }
            }
        }

        return foundIndex;

    }
}

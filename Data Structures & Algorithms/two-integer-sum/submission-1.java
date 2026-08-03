class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hush= new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(hush.containsKey(diff)){
                return new int[]{hush.get(diff), i};
            }
            else {
                hush.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}

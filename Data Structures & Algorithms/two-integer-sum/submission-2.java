class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        int indexx = 0;
        for(int num : nums){
            int diff = target - num;

            if(hash.containsKey(diff)){
                return new int[]{ hash.get(diff), indexx};
            }

            hash.put(num, indexx);
            indexx++;
        }
        throw new IllegalArgumentException("No two sum solution found for the given target.");
    }
}

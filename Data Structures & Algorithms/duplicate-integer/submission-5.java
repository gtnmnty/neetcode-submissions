
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> seen = new Hashtable<>();

        for(int i=0;i<nums.length;i++){
            if(seen.containsKey(nums[i])==false){
                seen.put(nums[i],1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
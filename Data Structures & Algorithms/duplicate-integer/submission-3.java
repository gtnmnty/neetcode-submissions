
class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.concurrent.ConcurrentHashMap<Integer, Integer> seen = new java.util.concurrent.ConcurrentHashMap<>();

        for(int num : nums){
            if(!seen.containsKey(num)){
                seen.put(num, 1);
            } else {
               return true;
            }
        }
        return false;
    }
}
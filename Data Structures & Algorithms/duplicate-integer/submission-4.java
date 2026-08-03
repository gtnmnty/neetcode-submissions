
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> seen = new Hashtable<>();

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

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> seen = new Hashtable<>();

        for(int num : nums){
            if(seen.containsKey(num)){
                return true;
            }

            seen.put(num, 1);
        }
        return false;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> newSet = new HashSet<>();
        int left = 0;
        int result  = 0;

        for(char c : s.toCharArray()){
            while(newSet.contains(c)){
                newSet.remove(s.charAt(left));
                left++;
            }

            newSet.add(c);
            result = Math.max(result, newSet.size());
        }
        return result;
    }
}

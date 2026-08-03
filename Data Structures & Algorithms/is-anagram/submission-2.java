class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        int[] counterS = new int[26];
        int[] counterT = new int[26];

        for(int i = 0; i < s.length(); i++){
            counterS[s.charAt(i) - 'a']++;
            counterT[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(counterS, counterT);
    }
}

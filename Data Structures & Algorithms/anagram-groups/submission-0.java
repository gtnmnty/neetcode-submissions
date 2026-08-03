class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> newMap = new HashMap<>();

        for(String string : strs){
            int[] count = new int[26];

            for(char c: string.toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            newMap.computeIfAbsent(key, k -> new ArrayList<>()).add(string);
        }
        return new ArrayList<>(newMap.values());
    }
}

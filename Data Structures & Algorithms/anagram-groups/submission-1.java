class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> newMap = new HashMap<>();

        for(String string: strs){
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);

            String sortedString = new String(charArray);
            newMap.putIfAbsent(sortedString, new ArrayList<>());
            newMap.get(sortedString).add(string);
        }
        return new ArrayList<>(newMap.values());
    }
}

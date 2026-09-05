class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        // Creates a list of arraylist
        for(int i = 0; i <  freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        // Adds the value as key and the count as its value
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Adds the key as the value and value as the key in freq list
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        // Loops 
        int[] result = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i > 0 && index < k; i--){
            for(int n : freq[i]){
                result[index++] = n;
                if(index == k) return result;
            }
        }
        return result;
    }
}

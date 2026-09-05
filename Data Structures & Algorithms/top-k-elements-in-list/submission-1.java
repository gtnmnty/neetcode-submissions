class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[20001];
        for (int i : nums) {   
            freq[i+10000]++;
        }
        int[] L = new int[k];
        for (int j = 0; j < k; j++) {
            int maxm = 0;
            int maxe = 0;
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > maxm) {
                    maxm = freq[i];
                    maxe = i-10000;
                }
            }
            L[j]=maxe;
            freq[maxe+10000]=0;
            
            
        }
        return L;

    }
        
    }


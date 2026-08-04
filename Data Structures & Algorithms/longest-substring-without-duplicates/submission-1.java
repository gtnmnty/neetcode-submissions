class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store the last seen index of each character (ASCII 128 or 256)
        int[] lastSeen = new int[128];
        // Initialize all indices to -1 (indicating the character hasn't been seen)
        java.util.Arrays.fill(lastSeen, -1);
        
        int maxLength = 0;
        int left = 0; // Left boundary of the sliding window
        
        // Iterate through the string with the right boundary pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character was seen inside the current window, move 'left' past it
            if (lastSeen[currentChar] >= left) {
                left = lastSeen[currentChar] + 1;
            }
            
            // Update or record the last seen position of the character
            lastSeen[currentChar] = right;
            
            // Calculate current window size and update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}

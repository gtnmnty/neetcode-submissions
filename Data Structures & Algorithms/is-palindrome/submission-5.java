class Solution {
    public boolean isPalindrome(String s) {
        // Remove everything except letters and numbers, then convert to lowercase
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 
        return str.equals( new StringBuilder(str).reverse().toString());
    }
}

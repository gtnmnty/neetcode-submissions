class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            if(Character.isLetterOrDigit(character)){
                newString.append(Character.toLowerCase(character));
            }
        }
        
        return newString.toString().equals(newString.reverse().toString());
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            char head = s.charAt(start);
            char tail = s.charAt(end);

            if(!Character.isLetterOrDigit(head)){
                start++;
            } else if (!Character.isLetterOrDigit(tail)) {
                end--;
            } else {
                if(Character.toLowerCase(head) != Character.toLowerCase(tail)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}

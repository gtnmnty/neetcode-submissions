class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length -1;

        while(left < right){
            int tempSum = numbers[left] + numbers[right];

            if (tempSum == target){
                return new int[] {left + 1, right + 1};
            } else if (tempSum < target){
                left++;
            } else{
                right--;
            }
        }
        return new int[0];
    }
}

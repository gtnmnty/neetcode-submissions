class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix.length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int l = 0;
        int r = (rows * cols) - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;
            int num = matrix[mid / cols][mid % cols];

            if(num == target) 
                return true;
            else if (num < target)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return false;
    }
}

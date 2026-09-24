class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if (piles.length == 0 || h < piles.length) return -1;

        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int k = l + (r - l) / 2;

            long totalTime = 0;
            for (int pile : piles) {
                totalTime += (pile + k - 1) / k;
                if(totalTime > h) break;
            }
            if (totalTime <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return res;

    }
}

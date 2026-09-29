class Solution {
    public int maxScore(int[] c, int k) {
        int n = c.length;
        int sum = 0;
        for (int i = 0; i < n; i++) sum += c[i];
        int e = n - k;
        int sum2 = 0;
        for (int i = 0; i < e; i++) sum2 += c[i];
        int min = sum2;
        for (int i = 0; i < k; i++) {
            sum2 -= c[i];
            sum2 += c[e + i];
            if (sum2 < min) min = sum2;
        }
        return sum - min;
    }
}
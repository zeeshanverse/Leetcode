class Solution {
    public boolean isPalindromic(String s) {
        // int left = 0;
        // int right = s.length() - 1;

        // while (left < right) {
        //     if (s.charAt(left) != s.charAt(right)) {
        //         return false;
        //     }

        //     left++;
        //     right--;
        // }

        // return true;

        int n = s.length();

        for (int i = 0; i < n * 8; i++) {
            int leftChar = i / 8;
            int leftBit = 7 - (i % 8);

            int rightIndex = n * 8 - 1 - i;
            int rightChar = rightIndex / 8;
            int rightBit = 7 - (rightIndex % 8);

            int left = (s.charAt(leftChar) >> leftBit) & 1;
            int right = (s.charAt(rightChar) >> rightBit) & 1;

            if (left != right) {
                return false;
            }
        }

        return true;
    }
}
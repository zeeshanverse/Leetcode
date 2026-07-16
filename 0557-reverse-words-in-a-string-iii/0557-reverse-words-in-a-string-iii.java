class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n) {

            // Skip spaces
            while (i < n && s.charAt(i) == ' ')
                i++;

            if (i == n)
                break;

            int start = i;

            // Move to end of current word
            while (i < n && s.charAt(i) != ' ')
                i++;

            // Append reversed word
            for (int j = i - 1; j >= start; j--) {
                ans.append(s.charAt(j));
            }

            // Skip extra spaces
            while (i < n && s.charAt(i) == ' ')
                i++;

            if (i < n)
                ans.append(' ');
        }

        return ans.toString();

        
    }
}
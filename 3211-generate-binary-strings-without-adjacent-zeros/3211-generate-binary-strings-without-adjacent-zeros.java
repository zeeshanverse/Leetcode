class Solution {

    public List<String> validStrings(int n) {

        List<String> ans = new ArrayList<>();

        solve(n, "", ans);

        return ans;
    }

    public void solve(int n, String s, List<String> ans) {

        if (s.length() == n) {
            ans.add(s);
            return;
        }

        // We can always add 1
        solve(n, s + "1", ans);

        // We can add 0 only if previous character is not 0
        if (s.length() == 0 || s.charAt(s.length() - 1) != '0') {
            solve(n, s + "0", ans);
        }
    }
}
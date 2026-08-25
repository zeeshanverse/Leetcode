class Solution {
    private Boolean dp[] ;

    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new Boolean[s.length()] ;

        return solve( 0 , s , wordDict) ;
    }

    boolean solve(int ind , String s , List<String> dict ) {
        if(ind == s.length()) return true ;

        if(dp[ind] != null ) return dp[ind] ;

        for(int i = ind + 1; i <= s.length() ; i++ ) {
            String temp = s.substring(ind , i ) ;
            if(dict.contains(temp) && solve(i , s , dict ) ) return dp[ind] = true ;
        }
        return dp[ind] = false ;
    }
}
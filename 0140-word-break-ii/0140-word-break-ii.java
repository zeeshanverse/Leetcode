class Solution {
    // private Boolean dp[] ;

    public List<String> wordBreak(String s, List<String> wordDict) {
        // dp = new Boolean[s.length()] ;
        HashSet<String> set = new HashSet<>() ;
        List<String> ans = new ArrayList<>() ;

        for(String word : wordDict ) set.add(word) ;

        solve( 0 , s , wordDict , set , ans , "") ;

        return ans ;
    }


    void solve(int ind , String s , List<String> dict , HashSet<String> set, List<String> ans , String word) {
        if(ind == s.length()) {
            ans.add(word.trim()) ;
            return ;
        }

        // if(dp[ind] != null ) return dp[ind] ;
        
        for(int i = ind + 1; i <= s.length() ; i++ ) {
            String temp = s.substring(ind , i ) ;
            if(set.contains(temp)) {
                String newWord = word + temp + " " ; 
                solve(i , s , dict , set , ans , newWord ) ;
            }
        }
    }
}